public class _3objectCode {
    static void update(int A[],int index,int value)
    {
        A[index]=value;
    }

    static void update2(int X,int Value)
    {
        X=Value;
    }
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6}; 
        update(A,2,9);       //value change for array(non-primitive)
        for (int V : A) {
            System.out.print(V+" ");
        }
        System.out.println("");



        int X=10;
        update2(X, 20);     //value not change for primirive
        System.out.println(X);
    }

}
