import java.util.Scanner;

public class _11reverseingCopyArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        int len,i,j;
        System.out.println("Enter the size of array:");
        len=sc.nextInt();
        int A[]=new int[len];
        int B[]=new int[len];
        System.out.println("Enter the elements of array :");
        for(i=0;i<len;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Array A elements are :");
        for (int x : A) {
            System.out.print(x+" ");
        }
        System.out.println(" ");

        for(i=len-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }

        System.out.println("Elements of Array A Copying Array B in reverse order are :");
        for(int x:B)
        {
            System.out.print(x+" ");
        }
    }
}