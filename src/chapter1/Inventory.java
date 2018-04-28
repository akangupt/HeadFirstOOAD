package chapter1;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Instrument> inventory; //not only guitars

    public Inventory() {
        inventory = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price,
                          InstrumentSpec instrumentSpec) {

        if(instrumentSpec instanceof GuitarSpec) {
            inventory.add(new Guitar(serialNumber, price, (GuitarSpec) instrumentSpec));
        }
        else if(instrumentSpec instanceof MandolinSpec) {
            inventory.add(new Mandolin(serialNumber, price, (MandolinSpec) instrumentSpec));
        }
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> matchedGuitars = new LinkedList<>();

        for (Instrument instrument : inventory) {
            if(instrument.getSpec().matches(searchGuitar)) {
                matchedGuitars.add((Guitar) instrument);
            }
        }

        return matchedGuitars;
    }

    public List<Mandolin> search(MandolinSpec searchMandolin) {
        List<Mandolin> matchedMandolins = new LinkedList<>();

        for (Instrument instrument : inventory) {
            if(instrument.getSpec().matches(searchMandolin)) {
                matchedMandolins.add((Mandolin) instrument);
            }
        }

        return matchedMandolins;
    }

}
