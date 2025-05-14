// everything outside the program is a resource.
// this program or say the try with resource ensure that the file is closed after the use without the finally block.
import java.io.*;   //for file input and output.
import java.util.*;

public class _7tryWithResource
{
    
    static void Divide() throws Exception
    {
           
        try(FileInputStream fi=new FileInputStream("file");Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        System.out.println(a/b);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}