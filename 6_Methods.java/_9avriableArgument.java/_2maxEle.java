public class _2maxEle {
    static int max(int ...A){
        if(A.length==0){
            return Integer.MIN_VALUE;
        }
        else{
            int m=A[0];
            for(int i=1;i<A.length;i++){
                if(A[i]>m){
                    m=A[i];
                }
            }
            return m;
        }
    }
    public static void main(String[] args) {
        System.out.println("Maimum element is : "+max(2,5,8,24,9,150,6,37,45));
        System.out.println("Maimum element is : "+max());
    }
}
