import java.util.*;
public class _6GCD {
    static int gcd(int m,int n) 
    {
        while (m!=n) {
            if (m>n){
                m=m-n;
            }
            else {
                n=n-m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("ENter the value of m:");
        m=sc.nextInt();
        System.out.println("ENter the value of n:");
        n=sc.nextInt();

        System.out.println("GCD of "+m+" and "+n+" is : "+gcd(m, n));
    }
}
