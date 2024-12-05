public class _1createArray{
    public static void main(String[] args) {
        
        int A[]=new int[5];                 //method 1
        System.out.println(A.length);
        System.out.println(A[3]);
        A[3]=15;
        System.out.println(A[3]);

        int B[]={1,2,3,4,5,6,7,8,9,};      //method 2
        System.out.println(B.length);
        System.out.println(B[4]);
    }
}