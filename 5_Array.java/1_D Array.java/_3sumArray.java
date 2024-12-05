public class _3sumArray {
    public static void main(String[] args) {
        int A[]={2,4,6,8,5,2,3};
        int Sum=0;
        for(int i=0;i<A.length;i++)
        {
           System.out.print(A[i]+" ");           //print the array elements 
           Sum=Sum+A[i];                         //Sum
        }
        System.out.println(" ");                //Space for next line
        System.out.println("Sum of Array elements is : "+Sum); 
    }
}



// public class _3sumArray {
//     public static void main(String[] args) {
//         int A[]={2,4,6,8,5,2,3};
//         int Sum=0;
//         for(int i:A)                        //using for each loop
//         {
//            Sum=Sum+i;                         //Sum
//         }
//         System.out.println("Sum of Array elements is : "+Sum); 
//     }
// }
