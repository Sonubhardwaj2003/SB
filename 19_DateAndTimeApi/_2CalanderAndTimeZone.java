import java.util.*;
public class _2CalanderAndTimeZone {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();

        System.out.println(gc);
        System.out.println(gc.getTimeZone());
        System.out.println(gc.getCalendarType());
        System.out.println(gc.getTime());
        System.out.println(gc.getFirstDayOfWeek());
        System.out.println(gc.isLeapYear(2000));
        System.out.println(gc.isWeekDateSupported());
        

        TimeZone t=gc.getTimeZone();

        System.out.println(t.getDisplayName());
        System.out.println(t.getAvailableIDs());
        System.out.println(t.getID());

    }
}
