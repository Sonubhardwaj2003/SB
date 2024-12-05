import java.util.Scanner;

public class _10copyingArrayEle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        int len,i;
        System.out.println("Enter the size of array:");
        len=sc.nextInt();
        int A[]=new int[len];
        int B[]=new int[len];
        System.out.println("Enter the elements of array :");
        for(i=0;i<len;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Array elements are :");
        for (int x : A) {
            System.out.print(x+" ");
        }
        System.out.println(" ");

        for(i=0;i<len;i++)
        {
            B[i]=A[i];
        }

        System.out.println("Array B is :");
        for(i=0;i<len;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
}
