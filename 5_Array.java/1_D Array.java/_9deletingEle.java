import java.util.Scanner;

public class _9deletingEle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        int len,i;
        System.out.println("Enter the size of array:");
        len=sc.nextInt();
        int A[]=new int[len];
        System.out.println("Enter the elements of array :");
        for(i=0;i<len;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Array elements are :");
        for (int x : A) {
            System.out.print(x+" ");
        }
        System.out.println(" ");

        System.out.println("Enter the position where u want to delete the element:");
        int pos=sc.nextInt();

        for(i=pos-1;i<len-1;i++)
        {
            A[i]=A[i+1];
        }

        System.out.println("New array elements after deletion are :");
        for (i=0;i<len-1;i++) {
            System.out.print(A[i]+" ");
        }
    }
}
