import java.util.*;
// package pettern.java;

public class pattern4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter the Pattern Size::");
        int n=sc.nextInt();
        System.out.println("Required pattern is ::");
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(num+" ");
                // System.out.format("%02d ",num);
                num++;
            }
            System.out.println("");
        }
    }
}
