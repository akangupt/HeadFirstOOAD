package chapter10.subway;

public class Connection {
    private String lineName;
    private Station station1, station2;

    public Connection(String lineName, Station station1, Station station2) {
        this.lineName = lineName;
        this.station1 = station1;
        this.station2 = station2;
    }

    public String getLineName() {
        return lineName;
    }

    public Station getStation1() {
        return station1;
    }

    public Station getStation2() {
        return station2;
    }
}
