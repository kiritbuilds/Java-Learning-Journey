import java.util.ArrayList;

 // T Character is a custome character or typecaster
// T = Kuch bhi ho sakta hai (Placeholder)

class MyDabba<T> {
    T content; // Dabbe ke andar ka maal

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // // Old Style
        // ArrayList list = new ArrayList(); // Koi Label nahi (Object type)
        // list.add("Harry");
        // // list.add(10); // Galti se number daal diya

        // // Jab nikalenge toh batana padega ki ye kya hai (Type Casting)
        // String s = (String) list.get(1); // 💥 BOOM! Error aayega kyunki 10 string
        // nahi hai
        // System.out.println(s);

        // New Style
        // <String> lagaya matlab Label laga diya
        ArrayList<String> list = new ArrayList<>();

        list.add("Harry");
        // list.add(10); // Java yahi rok dega (Compile Time Error)

        // Nikalte waqt Casting ki zarurat nahi
        String s = list.get(0); // ✅ Direct mil gaya
        System.out.println(s);


         // Aaj T ko String bana diya
        MyDabba<String> d1 = new MyDabba<>();
        d1.setContent("Mithai");

        // Kal T ko Integer bana diya
        MyDabba<Integer> d2 = new MyDabba<>();
        d2.setContent(100);

        System.out.println(d1.getContent());
        System.out.println(d2.getContent());
       
    }
}