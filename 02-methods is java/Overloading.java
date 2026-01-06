public class Overloading{
   static void foo(){
      System.out.println("Hii Kirit!");
   }
   
   static void foo(int a){
      System.out.println("Hii " + a + " Kirit!");
   }
   static void foo(int a, int b){
      System.out.println("Hii " + a + " Kirit!");
      System.out.println("Hii " + b + " Kirit!");
   }
   public static void main(String[] args) {
      foo();
      foo(365);
      foo(1635, 365);
   }
}