import java.util.*;

public class _4searching {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        int A[]={2,5,7,24,3,98,45};
        System.out.println("Enter the value for Searchimg");
        int key=sc.nextInt();

        for(int i=0;i<A.length;i++)
        {
            if(A[i]==key)
            {
                System.out.println("Value "+key+" is present at index :"+i);
                System.exit(0);
            }
        }
        System.out.println("value not present");
    }
}
