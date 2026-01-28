public class Nes_Exce {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try {
            System.out.println("Watch Video No 82 ");
        try {
            //  int c = 10/0; Try Ke Liye Ki Arithmetic Me Jump Karke General Me JAta Hai Ya NAhin
            System.out.println(marks[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sorry This Index Does Not Exist " );
            System.out.println(e);            
            System.out.println("Exception is Level 2 ");
        } 
    }
        catch (Exception e) {
            System.out.println("Exception is Level 1 ");
            System.out.println(e);
        }
    }
  }
