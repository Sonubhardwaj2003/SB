import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class _3LocalDateAndTime {
    public static void main(String[] args) {
        // LocalDate ld=LocalDate.ofEpochDay(7);
        // LocalDate ld=LocalDate.now();
        // LocalDate ld=LocalDate.of(2003, 07, 30);
        LocalDate ld=LocalDate.ofYearDay(2003, 361);
        System.out.println(ld);

        // LocalTime lt=LocalTime.now();
        LocalTime lt=LocalTime.now();
        // int lt1=lt.getMinute();
        // int lt1=lt.getHour();
        // LocalTime lt1=lt.minusHours(30);
        LocalTime lt1=lt.plusHours(3);

        System.out.println(lt1);



        // and many more methods..


        // Date Formatter
        ZonedDateTime z=ZonedDateTime.now();

        // DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/mm/yyyy hh.mm.ss z Z");
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/mm/yyyy HH.mm.ss z Z");
        System.out.println(df.format(z));

        System.out.println(z.get(ChronoField.DAY_OF_WEEK));
        // and many more constants with chronoField 
    }
}
