import java.util.*;

public class _1DateAndTime {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // this method prints the time in milliseconds since 1 jan 1970.
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);

        // date package .bydefault it pick the current date and time.
        // Date d=new Date();
        // System.out.println(d);

        Date d=new Date("07/30/2003");
        System.out.println(d);
        System.out.println(d.getMonth());
        // months,day...and everything is started with zero ..for july month it provide 6
        // and many more methods.
    }    
}
