package chapter1;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          GuitarSpec guitarSpec) {

        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> matchedGuitars = new LinkedList<>();

        for (Guitar guitar : guitars) {
            GuitarSpec guitarSpec = guitar.getGuitarSpec();
            if(guitarSpec.matches(searchGuitar)) {
                matchedGuitars.add(guitar);
            }
        }

        return matchedGuitars;
    }
}
