import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        int yr;
        System.out.println("Enter a Year to check");
        yr=sc.nextInt();

        if(yr%4==0 && yr%100!=0 || yr%400==0)
        {
            System.out.println(yr+" is a leap Year");
        }
        else{
            System.out.println(yr+" is not a leap year");
        }
    }
}