package chapter2;

public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public boolean equals(Object bark) {
        if(bark instanceof Bark) {
            return this.sound.equalsIgnoreCase(((Bark) bark).getSound());
        }
        return false;
    }
}
