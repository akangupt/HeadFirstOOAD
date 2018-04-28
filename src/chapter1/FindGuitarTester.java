package chapter1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindGuitarTester {

    final static private String INSTRUMENT_TYPE = "instrumentType";
    public static void main (String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Map erinInstrumentProperties = new HashMap();
        erinInstrumentProperties.put("Builder", Builder.GIBSON);
        erinInstrumentProperties.put("BackWood", Wood.MAPLE);
        InstrumentSpec whatErinLikes = new InstrumentSpec(erinInstrumentProperties);

        List<Instrument> matchedInstruments = inventory.search(whatErinLikes);
        if(!matchedInstruments.isEmpty()) {
            System.out.println("Erin, you might like these instruments:");
            for(Instrument instrument : matchedInstruments) {
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("We have a " + spec.getProperty("instrumentType") +
                        " with the following properties:");
                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
                    String propertyType = (String) j.next();
                    if(propertyType.equals(INSTRUMENT_TYPE)) continue;
                    System.out.println(" "+ propertyType + " : " + spec.getProperty(propertyType) );
                }
                System.out.println("\nYou can have it for only $" + instrument.getPrice());
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {

        Map properties = new HashMap();
        properties.put("Builder", Builder.GIBSON);
        properties.put("BackWood", Wood.MAPLE);
        properties.put("instrumentType", InstrumentType.GUITAR);
        inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));
    }


}
