package chapter1;

public class GuitarSpec extends InstrumentSpec{

    private int numString;

    public GuitarSpec(Builder builder, String model, Type type,
                  int numString, Wood backwood, Wood topwood) {
        super(builder, model, type, backwood, topwood);
        this.numString = numString;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if(!(otherSpec instanceof GuitarSpec)) return false;
        else if(!super.matches(otherSpec)) return false;
        else if(this.numString != (((GuitarSpec) otherSpec).numString)) return false;
        return true;
    }

    public int getNumString() {
        return numString;
    }

}
