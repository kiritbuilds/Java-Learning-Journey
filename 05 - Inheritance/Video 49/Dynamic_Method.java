class Phone {
    public void name() {
        System.out.println("Hello Phone:");
    }

    public void greet() {
        System.out.println("Good Morning!");
    }
}

class SmartPhone extends Phone {
    public void name() {
        System.out.println("Hello SmartPhone");
    }

    public void music() {
        System.out.println("Play Music...");
    }
}

public class Dynamic_Method {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        // Phone Se Reference leke SmatPhone Ki Method Call Hoti Hai Kyuki Object Uska
        // Create Hoga...
        obj.name();
        // obj.music();
        // Yeh Music Run Nahin Hoga Because Reference Phone Class Ka Hai Yeh only Phone
        // Class Me Jo Method Same Ya Only Phone Class Me Method Hoga Wahi Run Hoga
        // Lekin Same Hoga To SmartPhone Ka Hi Call Hoga Because Obj Create SmartPhone
        // Ka Hua Hai.
        // Because Reference Uska Hai Lekin Obj Create Smart Phone Ka Hua Hai...
        obj.greet();
    }
}
