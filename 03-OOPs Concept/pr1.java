class Employee{
     int salary;
     String name;
     public int getSalary(){
        return salary;
    }
     public String getName(){
        return name;
     }
     public void setName(String n){
        name = n;
     }
}


public class pr1{
    public static void main(String[] args) {
     // Problem 1
     Employee kirit = new Employee();
     kirit.setName("KiritKateshiya");  
     System.out.println(kirit.getName());
     kirit.salary = 50000;
     System.out.println(kirit.getSalary());
     
    }
}