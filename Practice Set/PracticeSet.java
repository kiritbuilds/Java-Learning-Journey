class MyDeprecated{
    @Deprecated
    public void display(){
        System.out.println("It is A Display Method ");
    }
}
interface GeneInsta{
    void Genrate();
}
public class PracticeSet {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Q.1 Create A Java Doc Without Using Interlig Idea Ham to wese bhi command se kar rhe hai..
        int a = 5;
        int b = 10;
        int c = a+b;
        System.out.println("Sum Of A And B Is A " + c);
        // Use Command To Generate JavaDoc javadoc -d myDocs3 PracticeSet.java

        // Q.2 Create a class and a method deprecated and check effect of Program Execution
        MyDeprecated d = new MyDeprecated();
        d.display();

        // Effect Of Compilation Is Only Show Warning ! To Don't Use This Method BEcause It Is A Deprecated.

        // Q.3 Is A Surpressed The Generated Warning 
        // after main class use this

        // Q.4 Create An Instance And Generate An Instance From it
        GeneInsta d1 = ()->{System.out.println("This Is A Lemada use To generated ");};
        d1.Genrate();
    }
}
