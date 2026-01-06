public class pr8{
    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            // pattern1_rec(3) and new line;
            // pattern1_rec(2) + 3 times star and new line
            // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
            // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1_rec(5);
    }
    
}
