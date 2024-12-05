// package methodOverloading.java;
import java.util.*;
public class _2reverseArray {
    static int reverse(int n){
        int rev=0,rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    // static int reverse(int A[]){
    //     int i,temp;
    //     int end=A.length-1;
    //     for( i=0;i<A.length/2;i++){
    //         temp=A[i];
    //         A[i]=A[end];
    //         A[end]=temp;
    //         end--;
    //     }
    //     for (i=0;i<A.length;i++) {
    //         System.out.print(A[i]+" ");
    //     }
    //     System.out.println("");
    //     return A[i];
    // } 

    static int reverse(int A[]){
        int B[]=new int[A.length];
        int i,j;
        for(i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }
        for (j=0;j<A.length;j++) {
            System.out.print(B[j]+" ");
        }
        System.out.println(" ");
        return B[j];
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner( System.in);
        int n;
        System.out.println("Enter the number :");
        n=sc.nextInt();
        System.out.println("reverse of given number is :"+reverse(n));

        int A[]={1,2,3,4,5,6,7};
        System.out.println("reverse of array is:");
        System.out.println(reverse(A));
    }
}
