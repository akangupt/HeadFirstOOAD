package chapter2;

public class BarkRecognizer {

    private DogDoor door;
    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("BarkRecognizer recognized a " + bark.getSound());
        if(bark.equals(door.getBark())) {
            door.open();
        }
    }


}
