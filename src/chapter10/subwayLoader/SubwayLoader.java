package chapter10.subwayLoader;

import chapter10.subway.Subway;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SubwayLoader {
    private Subway subway;

    public SubwayLoader(Subway subway) {
        this.subway = new Subway();
    }

    public Subway loadFromFile(File subwayFile) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(subwayFile));
        loadStations(subway, bufferedReader);
        String lineName = bufferedReader.readLine();
        while(lineName != null && lineName.length() > 0) {
            loadLine(subway, bufferedReader, lineName);
            lineName = bufferedReader.readLine();
        }
        bufferedReader.close();
        return subway;
    }

    private void loadStations(Subway subway, BufferedReader bufferedReader) throws Exception{
        String line = bufferedReader.readLine();
        while(line.length() > 0) {
            subway.addStation(line);
            line = bufferedReader.readLine();
        }
    }

    private void loadLine(Subway subway, BufferedReader bufferedReader, String lineName) throws Exception{
        String station1Name = bufferedReader.readLine();
        String station2Name = bufferedReader.readLine();
        while(station2Name != null && station2Name.length() > 0) {
            subway.addConnection(station1Name, station2Name, lineName);
            // station 2 is now station 1
            station1Name = station2Name;
            station2Name = bufferedReader.readLine();
        }
    }
}
