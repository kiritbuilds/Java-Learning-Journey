public class day6_1 {
    public static void main(String[] args) {
        // float[] arr = new float[5];
        System.out.println("Enter Number:");
        float[] arr = {70.5f,80.8f,45.5f,5.f,40.8f};
        // float sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        float sum = 0;
        for(float element : arr){
            sum = sum + element;
        }
        System.out.println("Sum Of Array is: " + sum);

    }
    
}
