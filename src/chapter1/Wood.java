package chapter1;

public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
    COCOBOLO, CEDAR, ADIRONADACK, ALDER, SITKA;

    @Override
    public String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD:
                return "indian rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "brazilian rosewood";
            case MAHOGANY:
                return "mahogany";
            case MAPLE:
                return "maple";
            case COCOBOLO:
                return "cocobola";
            case CEDAR:
                return "cedar";
            case ADIRONADACK:
                return "adironadack";
            case ALDER:
                return "alder";
            case SITKA:
                return "sitka";
        }
        return null;
    }

}
