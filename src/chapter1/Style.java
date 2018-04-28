package chapter1;

public enum Style {
    A, F;

    @Override
    public String toString() {
        switch(this) {
            case A:
                return "A";
            case F:
                return "F";
        }
        return null;
    }
}
