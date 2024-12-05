public class _2accessingArray {
    public static void main(String[] args) {
        int A[]={1,3,5,4,7,8,2,6};
        for(int i=0;i<=A.length-1;i++)           //using for loop >>forward
        {
            System.out.print(A[i]+" ");
        }

        System.out.println(" ");

        for(int i=A.length-1;i>=0;i--)           //using for loop >>reverse
        {
            System.out.print(A[i]+" ");
        }
    }
}




// public class _2accessingArray {
//     public static void main(String[] args) {
//         int A[]={1,3,5,4,7,8,2,6};
//         for(int x:A)                              //using for each loop >>work only in forward printing
//         {
//             System.out.println(x);
//         }
//     }
// }