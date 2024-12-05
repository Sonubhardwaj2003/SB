import java.util.*;
public class _5primeNum {
    static void primeNum(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                count++;
            }
        }
        System.out.println("fators of number is "+count);
        if(count>2){
            System.out.println("So,"+n+" is not a prime number");
        }
        else
        System.out.println("So,"+n+" is a prime number");
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("Enter a Number:");
        n=sc.nextInt();
        System.out.println("A number is Prime if it has only 2 factors, 1 and itself,then");
        primeNum(n);
    }
}



// import java.util.*;
// public class _5primeNum {
//     static boolean isprimeNum(int n)
//     {
//         for(int i=2;i<=n/2;i++)
//         {
//             if(n%i==0){
//                return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc=new Scanner (System.in);
//         int n;
//         System.out.println("Enter a Number:");
//         n=sc.nextInt();
//         // System.out.println("A number is Prime if it has only 2 factors, 1 and itself,then");
//         System.out.println(isprimeNum(n));
//     }
// }