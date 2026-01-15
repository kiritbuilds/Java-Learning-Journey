interface Mobile {
    void call();

    void sms();

    default void camera() {
        System.out.println("Default Camera Feature");
    }
}

// isme camera method problem thi pehle because camera interface me rakhne par
// niche class me implement karna complusory tha but java 8 aane ke bad yeh
// decide ho gaya ki ab complusory nahi hai kyoki default feature aa gaya usme
// ham default karne ke bad implement na kare to bhi chalega ..
class Samsung implements Mobile {
    public void call() {
        System.out.println("Samsung Calling");
    }

    public void sms() {
        System.out.println("Samsung SMS");
    }
}

class Iphone implements Mobile {
    public void call() {
        System.out.println("iPhone Calling");
    }

    public void sms() {
        System.out.println("iPhone SMS");
    }

    // overriding default method
    public void camera() {
        System.out.println("iPhone HD Camera");
    }
}

public class Default_Methods {
    public static void main(String[] args) {
        Mobile m = new Samsung();
        // Object Samsung no che mate camera default no print thashe kemke ek j method
        // che but jo iphone class object create kare to camera teno use thase kem ke
        // Camera Method > Default Method...
        // Mobile m = new Iphone();
        m.call();
        m.sms();
        m.camera();
    }
}
