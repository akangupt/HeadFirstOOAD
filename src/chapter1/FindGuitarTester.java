package chapter1;

import java.util.List;

public class FindGuitarTester {

    public static void main (String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchedGuitars = inventory.search(whatErinLikes);
        if(!matchedGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for(Guitar guitar : matchedGuitars) {
                System.out.println("We have a " +
                        guitar.getGuitarSpec().getBuilder() + " " + guitar.getGuitarSpec().getModel() + " " +
                        guitar.getGuitarSpec().getType() + " guitar:\n " +
                        guitar.getGuitarSpec().getBackwood() + " back and sides,\n " +
                        guitar.getGuitarSpec().getTopwood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to inventory

        inventory.addGuitar("1", 122.0, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("2", 102.0, Builder.FENDER, "stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }

}
