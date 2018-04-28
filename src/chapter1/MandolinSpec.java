package chapter1;

public class MandolinSpec extends InstrumentSpec{
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type,
                      Style style, Wood backwood, Wood topwood) {
        super(builder, model, type, backwood, topwood);
        this.style = style;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if(!(otherSpec instanceof MandolinSpec)) return false;
        else if(!super.matches((MandolinSpec) otherSpec)) return false;
        else if(this.style != (((MandolinSpec) otherSpec).style)) return false;
        return true;
    }

    public Style getStyle() {
        return style;
    }
}
