import java.util.Date;

public class DateClassDemo {
    public static void main(String[] args) {
        // Constructors
        Date d = new Date();
        System.out.println(d);

        // Date d1 = new Date(2005,03,16);
        // System.out.println(d1);

        // Date d2 = new Date(2005,03,16,7,24);
        // System.out.println(d2);

        // Date d3 = new Date(2005,03,16,7,24,8);
        // System.out.println(d3);

        // Date d4 = new Date(16);
        // System.out.println(d4);

        // Methods

        // Tommorrow Date Is 6 or not 6 Yes True Print Because Boolean First Convert
        // Integer into date Create Object
        System.out.println(d.after(new Date(6)));

        // Yesterday Date Is 4 or not 4 Yes True Print Because Boolean First Convert
        // Integer into date Create Object
        // Aap Java se puch rahe hain: "Kya 2026 (d), 1970 (Date(4)) se pehle aata hai?"
        // Jawaab: False. (Kyunki 2026 toh 1970 ke baad aata hai).
        System.out.println(d.before(new Date(4)));

        // 1. Aaj ki date
        Date d1 = new Date();
        System.out.println("Original Date (d1): " + d1);

        // --- CLONE METHOD USE ---
        // d1 ki photocopy banayi d2 mein
        // (Date) likhna zaruri hai kyunki clone Object deta hai
        Date d2 = (Date) d1.clone();
        System.out.println("Cloned Date (d2):   " + d2);

        // --- COMPARE TO METHOD USE ---

        // Case 1: Dono Same hain (d1 aur d2)
        int result1 = d1.compareTo(d2);
        System.out.println("Comparison (d1 vs d2): " + result1); // Output: 0

        // Case 2: Ek Future date banate hain
        // Abhi ke time mein 1000ms (1 sec) jod diya
        Date d3 = new Date(d1.getTime() + 1000);

        // Kya d1, d3 se chota hai?
        int result2 = d1.compareTo(d3);
        System.out.println("Comparison (d1 vs d3): " + result2); // Output: -1 (Kyunki d1 pehle aata hai)

        // Case 3: Kya d3, d1 se bada hai?
        int result3 = d3.compareTo(d1);
        System.out.println("Comparison (d3 vs d1): " + result3); // Output: 1 (Kyunki d3 baad mein aata hai)

        // Converts this Date object to a String of the form:
        System.out.println(d.toString());
    }
}
