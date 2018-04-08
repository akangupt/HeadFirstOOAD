package chapter1;

public class Guitar {
    private String serialNumber, builder, model, type, backwood, topwood;
    private double price;

    public Guitar(String serialNumber, double price,
                  String builder, String model, String type,
                  String backwood, String topwood) {

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

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBackwood() {
        return backwood;
    }

    public String getTopwood() {
        return topwood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = price;
    }
}

