import java.util.*;
public class gradeMark {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
    
        int m1,m2,m3;
        float p;
        System.out.println("Enter the marks of three subjects: ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        p=(m1+m2+m3)/3;
        System.out.println(p);
        
        if(p<=100 && p>90){
            System.out.println("Grade A"); 
        }
        else if(p<=90 && p>80){
            System.out.println("Grade B");
        }
        else if(p<=80 && p>70){
            System.out.println("Grade C");
        }
        else if(p<=70 && p>60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("fail");
        }
    }
}
