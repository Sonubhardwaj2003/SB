public class _5maxElement {
    public static void main(String[] args) {
        int A[]={2,5,100,24,3,98,45};
        int max=A[0];
        for (int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        System.out.println("Max element of array is :"+max);
    }
}
