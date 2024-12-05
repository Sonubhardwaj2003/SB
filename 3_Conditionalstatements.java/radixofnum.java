import java.util.*;
public class radixofnum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number to check");
        String str=sc.nextLine();

        if(str.matches("[01]+"))
        {
            System.out.println(str+" Number is in the form of  Binary");
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println(str+" Number in the form of is Octal");
        }
        else if(str.matches("[0-9]+"))
        {
            System.out.println(str+" Number is in the form of decimal");
        }
        else if(str.matches("[0-9A-F]+"))
        {
            System.out.println(str+" Number is in the form of Hexadecimal");
        }
        else
        {
            System.out.println(str+" num is in invalid form");
        }
    }
}
