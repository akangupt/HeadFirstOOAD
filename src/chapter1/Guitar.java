package chapter1;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price,
                  Builder builder, String model, Type type,
                  Wood backwood, Wood topwood) {

        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = new GuitarSpec(builder, model, type, backwood, topwood);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public GuitarSpec getGuitarSpec() {
        return this.guitarSpec;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = price;
    }
}

