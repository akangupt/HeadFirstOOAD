package chapter10.subway;

public class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Station station) {
        return station.getName().toLowerCase().equals(name);
    }

    // General practice to override the hashCode if you override the equals method
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
}
