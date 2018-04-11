package chapter2;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Bark bark = new Bark("woof");
        door.setBark(bark);
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        recognizer.recognize(bark);
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nRufus starts barking...");
        recognizer.recognize(new Bark("woofs"));
        System.out.println("Door doesn't open.");
    }
}
