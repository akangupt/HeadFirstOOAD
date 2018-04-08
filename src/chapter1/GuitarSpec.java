package chapter1;

public class GuitarSpec {

    private String model;
    private Builder builder;
    private Wood backwood, topwood;
    private Type type;
    private int numString;

    public GuitarSpec(Builder builder, String model, Type type,
                  int numString, Wood backwood, Wood topwood) {

        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numString = numString;
        this.backwood = backwood;
        this.topwood = topwood;
    }

    public boolean matches(GuitarSpec otherSpec) {

        if (builder != otherSpec.getBuilder()) return false;
        if (!model.equals(otherSpec.getModel())) return false;
        if (type != otherSpec.getType()) return false;
        if (backwood != otherSpec.getBackwood()) return false;
        if (topwood != otherSpec.getTopwood()) return false;

        return true;
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

    public int getNumString() {
        return numString;
    }



}
