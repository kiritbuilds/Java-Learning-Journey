/**
 * This is Method Tags Java Documenation.
 * @author Kirit (Kirit Kateshiya)
 * @version 3.0
 */
public class MethodTagsDemo {
    /**
     * @param args These are arguments suplied command line
     */
    public static void main(String[] args) {
        System.out.println("I Am A Main Method ");
    }
     
                      // Methods Summary
        /**
         * 
         *  @param i This is the first number add
         *  @param j This is the Second number add
         *  @return Sum of two numbers as an integer
         *  @throws Exception if i is 0
         *  @deprecated This Method is Deprecated Don't use 
         */
        
        public int add(int i, int j) throws Exception{
            if(i==0){
                throw new Exception();
            }
            int c;
            c = i+j;
            return c;
    }
}