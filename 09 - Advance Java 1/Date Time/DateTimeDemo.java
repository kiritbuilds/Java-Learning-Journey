public class DateTimeDemo {
    public static void main(String[] args) {
        // MilliSecond Calculation Current Time To Time Start In Computer 1970
        long currentMillis = System.currentTimeMillis();
        System.out.println("Current Time In MilliSecond Is A " + currentMillis);

        // Second Calculation Current Time 
        long Seconds = currentMillis/1000;
        System.out.println("Current Time In Seconds Is A " + Seconds);

        // Minutes Calculation Current Time
        long Minutes = Seconds/60;
        System.out.println("Current Time In Minutes Is A " + Minutes);

        // Hours Calculation Current Time
        long Hours = Minutes/60;
        System.out.println("Current Time In Hours Is A " + Hours);

        // Days Calculation Current Time
        long Days = Hours/24;
        System.out.println("Current Time In Days Is A " + Days);

        // Years Calculation Current Time
        long Years = Days/365;
        System.out.println("Current Time In Years Is A " + Years); 
    }
}
