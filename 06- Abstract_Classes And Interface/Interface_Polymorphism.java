interface GPS {
    void navigate();
}

interface Camera {
    void takePhoto();
}

interface MediaPlayer {
    void playMusic();
}

class CellPhone {
    void call() {
        System.out.println("Calling...");
    }

    void receiveCall() {
        System.out.println("Receiving call...");
    }
}

class SmartPhone extends CellPhone
        implements GPS, Camera, MediaPlayer {

    // GPS
    public void navigate() {
        System.out.println("Navigating using GPS");
    }

    // Camera
    public void takePhoto() {
        System.out.println("Taking photo with camera");
    }

    // MediaPlayer
    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class Interface_Polymorphism {
    public static void main(String[] args) {

        // Interface reference, object SmartPhone
        GPS g = new SmartPhone();
        g.navigate();
        // g.takePhoto(); not allowed

        Camera c = new SmartPhone();
        c.takePhoto();

        MediaPlayer m = new SmartPhone();
        m.playMusic();

        // Class reference
        SmartPhone s = new SmartPhone();
        s.call();
        s.navigate();
        s.takePhoto();
        s.playMusic();
    }
}
