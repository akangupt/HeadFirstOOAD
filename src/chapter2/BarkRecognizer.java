package chapter2;

import java.util.List;

public class BarkRecognizer {

    private DogDoor door;
    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("BarkRecognizer recognized a " + bark.getSound());
        List<Bark> barks = door.getAllowedBarks();
        for(Bark b : barks) {
            if(bark.equals(b)) {
                door.open();
                return;
            }
        }
        System.out.println("This dog is not allowed.");
    }

}
