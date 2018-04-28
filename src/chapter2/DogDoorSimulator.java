package chapter2;

public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.addAllowedBarks(new Bark("woof"));
        door.addAllowedBarks(new Bark("bwah"));

        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        recognizer.recognize(new Bark("woof"));
        System.out.println("\nFido has gone outside...");
        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("\nFido's all done...\nbut he is stuck outside!");

        System.out.println("\nRufus starts barking...");
        recognizer.recognize(new Bark("woofs"));

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fido barks to come inside...");
        recognizer.recognize(new Bark("bwah"));
        System.out.println("Fido came inside.");
    }
}
