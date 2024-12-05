import java.util.*;
// package pettern.java;

public class pattern3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter the Pattern Size::");
        int n=sc.nextInt();
        System.out.println("Required pattern is ::");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+j+" ");
            }
            System.out.println("");
        }
    }
}
