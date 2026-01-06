public class vararg {
    static int sum(int ...arr){
        // Available as int[] arr
        int result = 0;
        for(int a: arr){
            result = result + a / arr.length;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs: ");
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 2 , 4 and 5 is: " + sum(2, 4, 5));
        System.out.println("The sum of 1, 2, 4 and 5 is: " + sum(1, 2, 4, 5));
    }
    
}
