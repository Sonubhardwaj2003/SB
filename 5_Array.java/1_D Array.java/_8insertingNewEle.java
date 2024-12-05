import java.util.*;

public class _8insertingNewEle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the length of array : ");
        int length=sc.nextInt();
        int A[]=new int[length];
        System.out.println("Array elements are :");
        for(int i=0;i<length-1;i++){
            A[i]=sc.nextInt();
        }

        System.out.println("Array elements are :");
        
        for(int x:A)
        {
            System.out.print(x+ " ");
        }
        System.out.println(" ");

        System.out.println("Enter the Position where u Want to insert new element :");
        int x=sc.nextInt();
        
        System.out.println("Enter the value of new element :");
        int Value=sc.nextInt();
        int i;

        for( i=A.length-1;i>x;i--)
        {
            A[i]=A[i-1];
        }
        A[i]=Value;
        System.out.println("New array Elements are :");

        for(i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    }
}
