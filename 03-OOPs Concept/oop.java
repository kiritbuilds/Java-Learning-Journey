class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
         System.out.println("My id is " + id);
         System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class oop {
    public static void main(String[] args) {
        System.out.println("This is our custom class:");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes
        harry.id = 15;
        harry. name = "Kirit";
        harry.salary = 34000;

        john.id = 56;
        john.name = "John Don";
        john.salary = 12000;

        //Printing Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
    
}
