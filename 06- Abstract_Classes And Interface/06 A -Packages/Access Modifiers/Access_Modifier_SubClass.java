class C1 {
    public int x = 50;
    protected int y = 45;
    int z = 40;
    // private int a = 35;
}

class C2 extends C1 {

}

public class Access_Modifier_SubClass {
    public static void main(String[] args) {
        C2 c = new C2();
        // Agar Dusre Package Me Yeh Class Extend Kare to use default ka access nahin
        // milega sirf aur sief public and Protected ka hi access milega private to
        // already jis class me bani hai use me use hogi...
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}
