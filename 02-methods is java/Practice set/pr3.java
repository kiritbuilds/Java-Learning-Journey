public class pr3 {
    static int natural(int n){
    if(n==1){
        return 1;
    }else{
        return n + natural(n-1);
    }
}
    public static void main(String[] args) {
        System.out.println("N Natural Number Sum Is: " + natural(3));
    }
}
