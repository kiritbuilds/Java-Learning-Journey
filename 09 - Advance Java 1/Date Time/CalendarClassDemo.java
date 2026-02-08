import java.util.Calendar;

public class CalendarClassDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());

        // c.add(1, 1000);
        // System.out.println(c);
        
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTime());
        System.out.println(c.getWeekYear());
        // System.out.println(c.getAvailableCalendarTypes());
        
        c.add(Calendar.YEAR, 4); // 4 saal aage jao
        System.out.println("After 4 years: " + c.getTime());

        c.add(Calendar.YEAR, -2); // 2 Sal Piche 
        System.out.println(c.getTime());

        c.add(Calendar.MONTH , -2); // 2 M0nth Piche
        System.out.println(c.getTime());
    }
}