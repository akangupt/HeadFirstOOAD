package chapter2;

import java.util.Timer;
import java.util.TimerTask;

public class BarkRecognizer {

    private DogDoor door;
    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark) {
        System.out.println("BarkRecognizer recognized a " + bark);
        door.open();

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                door.close();
                timer.cancel();
            }
        }, 5000);
    }


}
