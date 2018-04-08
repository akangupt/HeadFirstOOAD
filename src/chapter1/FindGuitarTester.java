package chapter1;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main (String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, "fender", "stratocastor",
                "electric", "Alder", "Alder");

        List<Guitar> matchedGuitars = inventory.search(whatErinLikes);
        if(!matchedGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for(Guitar guitar : matchedGuitars) {
                System.out.println("We have a " +
                        guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + " guitar:\n " +
                        guitar.getBackwood() + " back and sides,\n " +
                        guitar.getTopwood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars to inventory

        inventory.addGuitar("1", 122.0, "fender", "stratocastor", "electric", "Alder", "Alder");
        inventory.addGuitar("2", 102.0, "fender", "stratocastor", "electric", "Alder", "Alder");

    }

}
