import java.util.*;
public class _1addingTwoMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        //array A insertion
        int len1;
        System.out.println("Enter the length of array A:");
        len1=sc.nextInt();
        int A[][]=new int[len1][len1];
        System.out.println("enter the Array A elements:" );
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A.length;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array A elements are :");
        for (int x[]: A) {
            for (int y: x) {
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }

        // Array B insertion
        int len2;
        System.out.println("Enter the length of array B:");
        len2=sc.nextInt();
        int B[][]=new int[len2][len2];
        System.out.println("enter the Array B elements:" );
        for(i=0;i<B.length;i++)
        {
            for(j=0;j<B.length;j++){
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array B elements are :");
        for (int x[]: B) {
            for (int y: x) {
                System.out.print(y+" ");
            }
            System.out.println(" ");
        }

        int C[][]=new int[len1][len1];
        if(len1==len2)
        {
            for(i=0;i<A.length;i++)
            {
                for(j=0;j<A.length;j++){
                    C[i][j]=A[i][j]+B[i][j];
                }
            }
            System.out.println("resultent Array is :");
            for(i=0;i<C.length;i++)
            {
                for(j=0;j<C.length;j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println(" ");
             }
        }
        else{
            System.out.println("Addition not possible");
        }
    }
}