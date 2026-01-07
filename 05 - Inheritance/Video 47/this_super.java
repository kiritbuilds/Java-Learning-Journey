class EkClass{
    int a;
    public int getA(){
        return a;
    }

    EkClass(int a){
        this.a = a;
        System.out.println("Hu Constructor Chu" + a);
    }
}
class DoClass extends EkClass{
    DoClass(int a, int d){
        super(a);
        System.out.println("Hu Constructor Chu");
    }
}
public class this_super{
    public static void main(String[] args){
        DoClass e = new DoClass(5,6);
        System.out.println(e);
    }
}

