import java.util.Scanner;

public class palindromeNum {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r,rev=0;
        int t=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse of number is  :"+rev);
        if(rev==t){
            System.out.println("number is Palindrom");
        }
        else{
            System.out.println("number is not Palindrom");
        }
    }
}
