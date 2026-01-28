class NegativeRadiusException extends Exception {   
    @Override
    public String toString() {
        return "MyException:" + getMessage();
    }
    
    @Override
    public String getMessage() {
        return "Radius Cannot Be Negative";
    }
}
    
public class throw_throws {
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static void main(String[] args) {
        try{
            // int c = divide(10, 0);
            // System.out.println(c);
            double radius = area(-2);
            System.out.println(radius);
        }
        catch(Exception e){
            System.out.println("Exception");
            System.out.println(e);
        }
        
    }
}
