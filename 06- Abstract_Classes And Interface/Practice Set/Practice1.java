//   Q.1  => Create An Abstract Class Pen With Methods write() and refill() as abstract methods.
abstract class Pen {
    abstract void write();

    abstract void refill();
}

// Q.2 => Create Class FountainPen And Extend With Pen and create anothwer
// method changeNib...

class FountainPen extends Pen {
    public void write() {
        System.out.println("Writing...");
    }

    public void refill() {
        System.out.println("Refiling...");
    }

    public void changeNib() {
        System.out.println("Changing...");
    }
}

// Q.3 => Create Interface Basic Animal And Create class MonKey and Human And
// Human Extend Monkey and Implements Basicn Animal ...

interface BasicAnimal {
    void eat();

    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }

}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Q.4 => Create Telephone Class and ring , lift and disconnect method with
// abstract methods create another class Smattelephone and Demonstrated
// Polymorphism

abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();

}

class SmartTelephone extends Telephone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void lift() {
        System.out.println("Lifting...");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }

    public void speak() {
        System.out.println("Speaking...");
    }
}

// Q.6 => Create An Interface TVRemote and use it to inherit Another Interface
// SmartTvRemote

interface TvRemote {
    void Button();

    void Tv1();

}

interface SmartTvRemote extends TvRemote {
    void PowerButton();
}

class Tv implements TvRemote {
    public void Button() {
        System.out.println("Button...");
    }

    public void Tv1() {
        System.out.println("Tv...");
    }

    public void PowerButton() {
        System.out.println("Tv On...");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Q.1 => Create An Abstract Class Pen With Methods write() and refill() as
        // abstract methods.

        // Q.2 => Create Class FountainPen And Extend With Pen and create anothwer
        // method changeNib...
        FountainPen a = new FountainPen();
        a.write();
        a.refill();
        a.changeNib();

        // Q.3 => Create Interface Basic Animal And Create class MonKey and Human And
        // Human Extend Monkey and Implements Basicn Animal ...
        Human b = new Human();
        b.jump();
        b.bite();
        b.eat();
        b.sleep();

        // Q.4 => Create Telephone Class and ring , lift and disconnect method with
        // abstract methods create another class Smattelephone and Demonstrated
        // Polymorphism

        Telephone c = new SmartTelephone();
        // c.speak(); // error Because Reference Is Used Telephone So Don't Use Speak
        // Those Time Jab
        // aap reference Abstract Class ka Le Rahe Ho Tab Usme Method Hogi Wahi Use
        // Karpaoge Agar aapko Jiska Object Create Hua USki Use KArni hai TO Pura Object
        // Uska Hi hona Chhaiye
        c.disconnect();
        c.lift();
        c.ring();
        // Q.5 => Demonstrate Polymorphism Using Monkey Class from Q.3
        Monkey d = new Human();
        // d.eat(); // You not use eat Method Because Reference Is Monkey Class Not USe Method As
                 // Object Create Class Same As Uper Class

        d.bite();
        d.jump();
        // Q.6 => Create An Interface TVRemote and use it to inherit Another Interface
        // SmartTvRemote
        Tv e = new Tv();
        e.Button();
        e.PowerButton();
        e.Tv1();
    }
}