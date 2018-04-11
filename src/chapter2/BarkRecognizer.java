package chapter2;

public class BarkRecognizer {

    private DogDoor door;
    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark) {
        System.out.println("BarkRecognizer recognized a " + bark);
        door.open();
    }


}
