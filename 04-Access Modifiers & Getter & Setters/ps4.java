class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.length =  4 ;
        this.breadth = 5 ;
    }
     public Rectangle(int l, int b){
        this.length =  l ;
        this.breadth = b ;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }


}
public class ps4 {
  public static void main(String[] args) {
    Rectangle p = new Rectangle();
    System.out.println(p.getLength());
    System.out.println(p.getBreadth());
  }  
}
