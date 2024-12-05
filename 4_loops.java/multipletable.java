import java.util.Scanner;

public class multipletable {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,ans; 

        System.out.println("Multiplaction table for "+n+" is :");
        
        for( i=1;i<=10;i++)
        {
            ans=n*i;
            System.out.println(n+" * "+i+" : "+ans);
        }
    }
}
