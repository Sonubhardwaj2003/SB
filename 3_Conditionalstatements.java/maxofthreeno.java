import java.util.*;
public class maxofthreeno {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
    
        int a,b,c;
        System.out.println("Enter the value of a b and c : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        if(a>b){
            if(a>c){
                System.out.println("lager is a :"+a);  
            }
        }
        else{
            if(b>c){
                System.out.println("larger is b :"+b);  
            }
            else{
                System.out.println("larger is c :"+c);  
            }
        }
    }
}
