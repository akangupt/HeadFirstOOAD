package chapter10.subway;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Subway {
    private List stations;
    private List connections;

    public Subway() {
        this.stations = new LinkedList();
        this.connections = new LinkedList();
    }

    public void addStation(String stationName) {
        if(!hasStation(stationName)) {
            stations.add(new Station(stationName));
        }
    }

    // checks if this station already exists in stations list
    public boolean hasStation(String stationName) {
        return stations.contains(new Station(stationName));
    }

    public void addConnection(String station1Name, String station2Name, String lineName) {
        if(!(hasStation(station1Name) && hasStation(station1Name))) {
            Station station1 = new Station(station1Name);
            Station station2 = new Station(station2Name);
            connections.add(new Connection(lineName, station1, station2));
            connections.add(new Connection(lineName, station2, station1));
        }
    }

    private boolean hasConnections(String station1Name, String station2Name, String lineName) {
        for(Iterator i = connections.iterator(); i.hasNext();) {
            Connection connection = (Connection) i.next();
            if(connection.getLineName().toLowerCase().equals(lineName)) {
                return (new Station(station1Name).equals(connection.getStation1()) ||
                        new Station(station2Name).equals(connection.getStation2()));
            }
        }
        return false;
    }

    private List<Connection> getDirections(String station1Name, String station2Name) {
        if (hasStation(station1Name) && hasStation(station2Name)) {

        }
        return new ArrayList<>();
    }

}
