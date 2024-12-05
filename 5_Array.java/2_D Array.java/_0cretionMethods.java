// import java.util.*;
public class _0cretionMethods {

    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        // Scanner sc=new Scanner(System.in);
        int i,j;
        int A[][]=new int[3][4];          //method 1
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[0].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("*****");
        // int A[][]=new int[3][4];          //method 1 (using for each loop)
        // for(int x[]:A)
        // {
        //     for(int y:x)
        //     {
        //         System.out.print(y+" ");
        //     }
        //     System.out.println(" ");
        // }


        int B[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4}};      //method 2
        for(i=0;i<B.length;i++)
        {
            for(j=0;j<B[0].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("*****");


        int C[][];                           //method 3
        C=new int[3][4];
        for(i=0;i<C.length;i++)                     
        {
            for(j=0;j<C[0].length;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("*****");
        

        int J[][];                           //method 4 (jagged array)
        J=new int[3][];
        J[0]=new int[4];
        J[1]=new int[8];
        J[2]=new int[1];
        for(i=0;i<J.length;i++)                     
        {
            for(j=0;j<J[i].length;j++)
            {
                System.out.print(J[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
