public class Prac3 {
    int x;
    int y;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("It Is A Area Setter");
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("It Is A Volume Setter");
        this.y = y;
    }
    public static void main(String[] args) {
        Prac3 obj = new Prac3();
        obj.setX(5);
        obj.setY(10);
       System.out.println(obj.getX());
       System.out.println( obj.getY()); 
  }   
}
