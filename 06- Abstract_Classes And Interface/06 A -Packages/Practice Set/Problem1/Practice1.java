// package MainCalculator;

// Problem 1 Is A Create Three Class In A Same Package 
// Output
// PS F:\java> javac -d . Practice1.java          
// PS F:\java> java MainCalculator/Practice1    
// This Is Main Method!

class Calculator {
    public void Calc(int a, int b) {
        System.out.println("Sum Of Number Is " + (a + b));
    }
}

class ScCalculator {
    public void ScCalc(int a, int b) {
        System.out.println("Subtract Is " + (a - b));
    }
}

class HbCalculator {
    public void HyCalc(int a, int b) {
        System.out.println("Sum is " + (a + b) + " Subtraction is " + (a - b));
    }
}

public class Practice1 {
    protected int ProInt = 45;
    int DefInt = 50;
    public static void main(String[] args) {
        System.out.println("This Is Main Method!");
    }
}