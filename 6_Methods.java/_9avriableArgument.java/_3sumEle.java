// package _9avriableArgument.java;

public class _3sumEle {
    static int sumEle(int ...A){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of elements are : "+sumEle(1,2,3,4,5,6,7,8,9));
    }
}