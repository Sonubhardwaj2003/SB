// package _9avriableArgument.java;

public class _4discount {
    static double discount(int ...A){
        double sum=0;
        for(int i=0;i<A.length;i++){
            sum+=
            A[i];
        }
        System.out.println("Doing shoping for Rs :$"+sum);

        double saving=0;
        if(sum>=500 && sum<1000)
        {
            saving+=(0.1)*sum;
        }
        else if(sum>=1000 && sum<5000)
        {
            saving+=(0.2)*sum;
        }
        else if(sum>=5000)
        {
            saving+=(0.4)*sum;
        }
        else{
            saving=0;
        }
        return saving;
    }
    public static void main(String[] args) {
        System.out.println("So,Saving Rs from shopping is :$"+discount(100,200,1000,700,5000));
    }
}
