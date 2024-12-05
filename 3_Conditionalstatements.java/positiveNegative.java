import java.util.*;
public class positiveNegative {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
    
        int x;
        System.out.println("Enter the value to check : ");
        x=sc.nextInt();

        if(x>0)
        {
            System.out.println("Number is positive");
        }
        else if(x<0)
        {
            System.out.println("number is negative");  
        }
        else
        {
            System.out.println("number may be zero or else");  
        }
    }
}
