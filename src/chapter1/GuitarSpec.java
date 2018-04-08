package chapter1;

public class GuitarSpec {

    private String model;
    private Builder builder;
    private Wood backwood, topwood;
    private Type type;

    public GuitarSpec(Builder builder, String model, Type type,
                  Wood backwood, Wood topwood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
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

}
