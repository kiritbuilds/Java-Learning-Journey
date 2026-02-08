import java.time.format.DateTimeFormatter;
import java.time.*;

public class JavaTimeDemo{
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        Clock c = Clock.systemDefaultZone();
        System.out.println(c);

        MonthDay m = MonthDay.now();
        System.out.println(m);

        Period p = Period.ofYears(5);
        System.out.println(p);

        YearMonth y = YearMonth.now();
        System.out.println(y);

        ZoneId  z = ZoneId.systemDefault();
        System.out.println(z);

        // Step 2: Formatter banaya (Sancha/Pattern)
        // Pattern ka matlab: Pehle Date dikhao, fir Month, fir Year
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        
        // Step 3: Date par Formatter lagaya (Apply kiya)
        String myDate = dt.format(df);
        System.out.println("Formatted (Sajawat 1):   " + myDate);
        }
}