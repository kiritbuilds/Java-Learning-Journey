class Animal{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("This is Animal Class");
        this.x = x;
    }
}
class Dog extends Animal{
    public int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class InQuiz {
    public static void main(String[] args) {
        // Create an Animal Class Object
        Animal k = new Animal();
        k.setX(61);
        System.out.println(k.getX());

        // Create an Dog class Object
        Dog s = new Dog();
        s.setY(9);
        System.out.println(s.getY());
    }
}
