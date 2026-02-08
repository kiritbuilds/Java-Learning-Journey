class C1{
    public int x = 50;
    protected int y = 45;
    int z = 40;
    private int a = 35;
    // public private protected and default modifier all are used in same class.
    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
}
}
public class Access_Modifier_Class {
    public static void main(String[] args) {
        C1 c = new C1();
        c.math1();
    }
}
