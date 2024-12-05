import java.util.*;
// package pettern.java;

public class pattern10 {
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
                if(j<=n-i){
                    System.out.print("  ");
                }
               else
               {
                System.out.print("* ");
               }
            }
            for(int j=0;j<i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
} 

