class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int k){
        id = k;
    }
}
public class Get{
    public static void main(String[] args) {
        MyEmployee c = new MyEmployee();
        c.setName("Kirit");
        System.out.println(c.getName());
        c.setId(45);
        System.out.println(c.getId());
    }
}