public class Finally_Excep {
    public static int Greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("This Is The End Of The Program ");
        }
    return -1;
}
    public static void main(String[] args) {
        int k = Greet();
        System.out.println(k); 
        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I Am Finally for Value of b = " + b);
            }
            b--;
        }       
    }
}
