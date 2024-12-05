import java.util.*;
public class _2maxOfTwoNum {
    //method  defination here /Method called
    static int max(int a,int b)      //formal parameter (copied actual parameter)
    {
        if (a>b) {
            return a;
        }
        else{
            return b;
        }
    }

    //method calling
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a :");
        a=sc.nextInt();
        System.out.println("Enter the value of b :");
        b=sc.nextInt();
        c=max(a, b);                                     //actual parameter
        System.out.println("Maximum number is :"+c);
    }
}
