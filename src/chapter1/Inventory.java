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
        inventory.add(new Instrument(serialNumber, price, instrumentSpec));
    }

    public List<Instrument> search(InstrumentSpec searchInstrument) {
        List<Instrument> matchedInstruments = new LinkedList<>();

        for (Instrument instrument : inventory) {
            if(instrument.getSpec().matches(searchInstrument)) {
                matchedInstruments.add(instrument);
            }
        }

        return matchedInstruments;
    }

}
