import java.time.*;
import java.util.*;
import java.time.format.*;

public class PracticeSet {
    public static void main(String[] args) {
        // Q.1 10 Students Name Print In the Use Of ArrayList
        ArrayList<String> ar = new ArrayList<>();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
        ar.add("E");
        ar.add("F");
        ar.add("G");
        ar.add("H");
        ar.add("I");
        ar.add("J");
        for (String o : ar) {
            System.out.println("Name Of Student Is " + o);
        }

        // Q.2 Print Using Date Class 21:30:05;
        // Date d = new Date();
        // System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        // Q.3 Repeat Question 2 Using Calendar Class
        Calendar c = Calendar.getInstance();
        System.out.println((c.get(Calendar.HOUR_OF_DAY)) + ":" +(c.get(Calendar.MINUTE)) + ":" + (c.get(Calendar.SECOND)));

        //Q.4 Repeat Question 2 USing Java.time
        LocalTime dt = LocalTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
        String myTime = dt.format(df);
        System.out.println(myTime);

        // Q.5 Create Set And Store duplicate element and checked duplicate is not come second time
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        s.add(9);;
        s.add(5);
        System.out.println(s);

    }
}
