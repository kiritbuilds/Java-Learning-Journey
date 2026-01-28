import java.util.Scanner;

class MyException extends Exception{
    public MyException(String Message){
        super(Message);
    }
    @Override
    public String toString(){
        return "MyException:" + getMessage();
    }
}

public class Exce_Class {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age<18){
            try {
                throw new MyException("You Cannot Vote! ");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
