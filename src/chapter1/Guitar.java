package chapter1;

public class Guitar {
    private String serialNumber, model;
    private Builder builder;
    private Wood backwood, topwood;
    private Type type;
    private double price;

    public Guitar(String serialNumber, double price,
                  Builder builder, String model, Type type,
                  Wood backwood, Wood topwood) {

        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackwood() {
        return backwood;
    }

    public Wood getTopwood() {
        return topwood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = price;
    }
}

