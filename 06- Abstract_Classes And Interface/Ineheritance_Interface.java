interface sampleInheritance{
    void meth1();
    void meth2();
}
interface childSampleInheritance extends sampleInheritance{
    void meth3();
    void meth4();
}
// Interface Cannot Implements Interface But Interface are extends another Interface 
// class cannot extends interface but class also implement interface
class MySampleClass implements childSampleInheritance{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
} 
public class Ineheritance_Interface {
    public static void main(String[] args) {
     MySampleClass obj = new MySampleClass();
     obj.meth1();
     obj.meth2();
     obj.meth3();
     obj.meth4();   
    }
}
