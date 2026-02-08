@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
    // void thisMethod2();
}

class Phone{
    public void showTime(){
        System.out.println("This Is a 8 Am");
    }
}

class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("This Is a 8 Pm");
    }

    @Deprecated
    public int sum(int a, int b){
        return (a+b);
    }
}

public class AnnotationDemo {
    @SuppressWarnings( "deprecation" )
    public static void main(String[] args) {
        NewPhone p = new NewPhone();
        p.showTime();
        p.sum(5,6);        
    }
}
