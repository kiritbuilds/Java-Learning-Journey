public class pr6{
    static double findAverage(int...arr){
        double sum = 0;
        for(int a: arr){
            sum = sum + a;
        }
        double average = sum / arr.length;

        return average;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Average Calculator:");

        // Method ko call karein aur result ko ek variable mein store karein
        double avg1 = findAverage(4, 5);
        System.out.println("The average of 4 and 5 is: " + avg1);

        double avg2 = findAverage(2, 4, 6);
        System.out.println("The average of 2, 4, and 6 is: " + avg2);
    }
}