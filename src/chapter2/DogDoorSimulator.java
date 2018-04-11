package chapter2;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.setAllowedBark("woof");
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        recognizer.recognize("woof");
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nRufus starts barking...");
        recognizer.recognize("woofs");
        System.out.println("\nDoor doesn't open");
    }
}
