public class _6secondLargestElement {
    public static void main(String[] args) {
        int A[]={2,5,100,24,3,98,45};
        int max1=A[0];
        int max2=A[0];
        for (int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("Max element of array is :"+max1);
        System.out.println("Second Max element of array is :"+max2);
    }
}
