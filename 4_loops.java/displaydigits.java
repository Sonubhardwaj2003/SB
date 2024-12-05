import java.util.Scanner;

public class displaydigits {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r;
        System.out.println("digits of "+n+" are :");
        while(n>0)
        {
            r=n%10;
            n=n/10;
            System.out.print(r+" ");
        }
    }
}