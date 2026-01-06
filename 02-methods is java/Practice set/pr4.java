public class pr4 {
    static void pattern2(int n){
        for(int i=n; i>1; i--){
            for(int j=0; j<i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern2(4);
    }
    
}
