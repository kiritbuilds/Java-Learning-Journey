// package Kirit;

class C1{
    public int x = 50;
    protected int y = 45;
    int z = 40;
    // private int a = 35;
}
public class Access_Modifier_Package{
    public static void main(String[] args) {
        C1 c = new C1();
        // Private Modifier are Not Use Same Package Public protected and Default are used to Same Package.
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}