public class day6_3 {
    public static void main(String[] args) {
        int[] physics = {90,85,70,75,98};
        float sum = 0;
        for(int element: physics){
            sum = (sum + element);
        }
        float average = sum /physics.length;
        System.out.println("Sum of Physics Marks is: " +sum);
        System.out.println("An Average of Marks Is: "+ average );
        
    }
    
}
