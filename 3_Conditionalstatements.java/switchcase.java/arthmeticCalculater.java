import java.util.*;
// package switchcase.java;

public class arthmeticCalculater {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
 
        System.out.println("Options");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        int a,b,c;
        System.out.println("Enter two values");
        a=sc.nextInt();
        b=sc.nextInt();
         
        System.out.println("enter the operation to perform from the given options");
        String opt=sc.next();

        switch (opt) {
            case "ADD" :
                c=a+b;
                System.out.println(c);
                break;
            case "SUB" :
                c=a-b;
                System.out.println(c);
                break;
            case "MUL" :
                c=a*b;
                System.out.println(c);
                break;
            case "DIV" :
                c=a/b;
                System.out.println(c);
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
