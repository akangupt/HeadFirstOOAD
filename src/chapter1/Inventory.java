package chapter1;

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

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> matchedGuitars = new LinkedList<>();
        for (Guitar guitar : guitars) {
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            Builder builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals(guitar.getGuitarSpec().getBuilder()))) continue;

            String model = searchGuitar.getModel().toLowerCase();
            if ((!model.isEmpty()) && (!model.equals(guitar.getGuitarSpec().getModel().toLowerCase()))) continue;

            Type type = searchGuitar.getType();
            if ((type != null) && (!type.equals(guitar.getGuitarSpec().getType()))) continue;

            Wood backwood = searchGuitar.getBackwood();
            if ((backwood != null) && (!backwood.equals(guitar.getGuitarSpec().getBackwood()))) continue;

            Wood topwood = searchGuitar.getTopwood();
            if ((topwood != null) && (!topwood.equals(guitar.getGuitarSpec().getTopwood()))) continue;
            matchedGuitars.add(guitar);
        }

        return matchedGuitars;
    }
}
