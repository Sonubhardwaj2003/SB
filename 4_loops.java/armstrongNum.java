import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r,sum=0;
        int t=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;              //for three digit number
            n=n/10;
        }
        System.out.println("Sum is :"+sum);
        if(t==sum){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}
