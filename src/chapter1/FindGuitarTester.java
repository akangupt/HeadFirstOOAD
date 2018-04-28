package chapter1;

import java.util.List;

public class FindGuitarTester {

    public static void main (String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchedGuitars = inventory.search(whatErinLikes);
        if(!matchedGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for(Guitar guitar : matchedGuitars) {
                System.out.println("We have a " +
                        guitar.getSpec().getBuilder() + " " + guitar.getSpec().getModel() + " " +
                        guitar.getSpec().getType() + " guitar:\n " +
                        guitar.getSpec().getBackwood() + " back and sides,\n " +
                        guitar.getSpec().getTopwood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }

        MandolinSpec whatEmaLikes = new MandolinSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC,
                Style.A, Wood.MAHOGANY, Wood.MAPLE);

        List<Mandolin> matchedMandolins = inventory.search(whatEmaLikes);
        if(!matchedGuitars.isEmpty()) {
            System.out.println("Ema, you might like these mandolins:");
            for(Mandolin mandolin : matchedMandolins) {
                System.out.println("We have a " +
                        mandolin.getSpec().getBuilder() + " " + mandolin.getSpec().getModel() + " " +
                        mandolin.getSpec().getType() + " mandolin:\n " +
                        mandolin.getSpec().getBackwood() + " back and sides,\n " +
                        mandolin.getSpec().getTopwood() + " top.\nYou can have it for only $" +
                        mandolin.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addInstrument("11277", 3999.95,
                new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
                        Wood.INDIAN_ROSEWOOD, Wood.SITKA));
        inventory.addInstrument("V95693", 1499.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                        Wood.ALDER, Wood.ALDER));
        inventory.addInstrument("V9512", 1549.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                        Wood.ALDER, Wood.ALDER));
        inventory.addInstrument("122784", 5495.95,
                new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6,
                        Wood.MAHOGANY, Wood.ADIRONDACK));
        inventory.addInstrument("76531", 6295.95,
                new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
        inventory.addInstrument("70108276", 2295.95,
                new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
                        Wood.MAHOGANY, Wood.MAHOGANY));
        inventory.addInstrument("82765501", 1890.95,
                new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6,
                        Wood.MAHOGANY, Wood.MAHOGANY));
        inventory.addInstrument("77023", 6275.95,
                new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
        inventory.addInstrument("1092", 12995.95,
                new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12,
                        Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
        inventory.addInstrument("566-62", 8999.95,
                new MandolinSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, Style.F,
                        Wood.COCOBOLO, Wood.CEDAR));
        inventory.addInstrument("6 29584", 2100.95,
                new MandolinSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC,
                        Style.A, Wood.MAHOGANY, Wood.MAPLE));
    }


}
