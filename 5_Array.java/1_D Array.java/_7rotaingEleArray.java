public class _7rotaingEleArray {
    public static void main(String[] args)
    {
        int A[]={4,8,10,23,5,6,78,58,99};
        System.out.println("Before rotating Array elements are :");
        for(int x:A)
        {
            System.out.print(x+" ");
        }
        System.out.println(" ");

        int temp=A[0];
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        System.out.println("After rotating (left) Elements are :");
        for(int x:A)
        {
            System.out.print(x+" ");
        }

    }
}




// public class _7rotaingEleArray {
//     public static void main(String[] args)
//     {
//         int A[]={4,8,10,23,5,6,78,58,99};
//         System.out.println("Before rotating Array elements are :");
//         for(int x:A)
//         {
//             System.out.print(x+" ");
//         }
//         System.out.println(" ");

//         int temp=A[A.length-1];
//         for(int i=A.length-2;i>=0;i--)
//         {
//             A[i+1]=A[i];
//         }
//         A[0]=temp;
//         System.out.println("After rotating (right) Elements are :");
//         for(int x:A )
//         {
//             System.out.print(x+" ");
//         }

//     }
// }