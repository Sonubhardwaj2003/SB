import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        int f=0,s=1,next,i;

        System.out.println("fibbonaci Series is :");
        System.out.print(f+" "+s+" ");
        for(i=0;i<n-2;i++)
        {
            next=f+s;
            f=s;
            s=next;
            System.out.print(next+" ");
        }
    }
}
