import java.time.*;
import java.time.format.*;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("E dd/MM/YYYY h:m a");
        String myDate = dt.format(df);
        System.out.println(myDate);

        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate1 = dt.format(df1);
        System.out.println(myDate1);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_TIME;
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);

        // Sahi Tarika: ZonedDateTime use karein (Data + Zone)
        ZonedDateTime zdt = ZonedDateTime.now(); // ✅
        System.out.println("Current Time with Zone: " + zdt);

        DateTimeFormatter df3 = DateTimeFormatter.RFC_1123_DATE_TIME;
        String myDate3 = zdt.format(df3);
        System.out.println(myDate3);


    }
}
