import java.util.*;
public class youngornot {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
    
        int x;
        System.out.println("Enter the age to check for young or not: ");
        x=sc.nextInt();

        if(x>=18 && x<=35)
        {
            System.out.println("you are young");
        }
        else if(x<18 && x>0)
        {
            System.out.println("you are teenager or not young ");  
        }
        else
        {
            System.out.println("You are old");  
        }
    }
}
