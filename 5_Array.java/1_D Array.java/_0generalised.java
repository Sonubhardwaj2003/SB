import java.util.Scanner;

public class _0generalised {
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);

    int len;
	System.out.println("Enter Array length : ");
	len=sc.nextInt();
	int a[]=new int[len];//declaration    	 
	System.out.print("Enter " + len + " Element to Store in Array :\n");
    for(int i=0; i<len; i++)
    {
        a[i] = sc.nextInt();
    }  

    System.out.print("Elements in Array are :\n");
    for(int i=0; i<len; i++)
    {
        System.out.print(a[i] + "  ");
    }  

    }
}
