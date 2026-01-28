public class Try_Catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        //Without Try:
        // int c = a / b;
        // System.out.println("The result Is " + c);
        // Error Ocuured 

        // With Try:
        try {
            int c = a/b;
            System.out.println("The result Is " + c);
        } catch (Exception e) {
            System.out.println("We Failed to divide, Reason: ");
            System.out.println(e);
        }
        System.out.println("End Of The Program ");
    }
}
