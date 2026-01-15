abstract class Parent2 {
    public Parent2() {
        System.out.println("Me Constructor Hoon");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet(); // aa be abstract method banavi parent ma che ene child ma implement karvi pade
                                  // and jo no kari to child abstract class karvi pade or thay jay abstract class.

    abstract public void greet2();
}

class Child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

// Child 3 ma abstract ni method implement nathi kari tethi jovo ke tene
// abstract class banavo padyo.
abstract class Child3 extends Parent2 {
    public void th() {
        System.out.println("I Am Good");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Parent2 p = new Parent2(); error object Not Create Abstract Class
        // Child2 c = new Child2(); only refeence no object create thay sake or
        // reference parent no hoy and object child no create kari to pan object bane
        // okk.
        // Child3 d = new Child3(); error object Not Create Abstract Class
    }
}
