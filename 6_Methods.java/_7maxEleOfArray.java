import java.util.*;
public class _7maxEleOfArray {
    static int greaterEle( int A[])
    {
        int i;
        int max=A[0];
        for(i=1;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int len,i;
        System.out.println("ENter the legth of the array :");
        len=sc.nextInt();
        int A[]=new int[len];
        System.out.println("ENter the array elements:");
        for(i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("the array elements are :");
        for (int x : A) {
            System.out.print(x+" ");
        }
        System.out.println("");
        System.out.println("Greatest element is :"+greaterEle(A));
    }
}
