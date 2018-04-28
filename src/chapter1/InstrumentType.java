package chapter1;

public enum InstrumentType {
    GUITAR, BONJO, DOBRO, FIDDLE, BASS, MANDOLIN;

    @Override
    public String toString() {
        switch (this) {
            case GUITAR:
                return "Guitar";
            case BONJO:
                return "Bonjo";
            case DOBRO:
                return "Dobro";
            case FIDDLE:
                return "Fiddle";
            case BASS:
                return "Bass";
            case MANDOLIN:
                return "Mandolin";
            default:
                return "Unspecified";
        }
    }
}
