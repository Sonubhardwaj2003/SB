import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
    
        int x;
        System.out.println("Enter the value to check for even or odd: ");
        x=sc.nextInt();

        if(x%2==0)
        {
            System.out.println(x+" Number is even");
        }
        else if(x%2!=0)
        {
            System.out.println(x+" Number is odd");  
        }
        else
        {
            System.out.println("somthing else");  
        }
    }
}
