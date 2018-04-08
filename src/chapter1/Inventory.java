package chapter1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          Builder builder, String model,
                          Type type, Wood backWood,
                          Wood topWood) {

        Guitar guitar = new Guitar(serialNumber, price, builder,
                model, type, backWood, topWood);
        guitars.add(guitar);
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> matchedGuitars = new LinkedList<>();
        for (Guitar guitar : guitars) {
            // Ignore serial number since that's unique
            // Ignore price since that's unique

            Builder builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder()))) continue;

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))) continue;

            Type type = searchGuitar.getType();
            if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType()))) continue;

            Wood backwood = searchGuitar.getBackwood();
            if ((backwood != null) && (!backwood.equals("")) && (!backwood.equals(guitar.getBackwood()))) continue;

            Wood topwood = searchGuitar.getTopwood();
            if ((topwood != null) && (!topwood.equals("")) && (!topwood.equals(guitar.getTopwood()))) continue;
            matchedGuitars.add(guitar);
        }

        return matchedGuitars;
    }
}
