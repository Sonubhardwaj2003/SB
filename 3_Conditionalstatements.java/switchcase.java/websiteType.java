import java.util.*;
// package switchcase.java;

public class websiteType {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Url");
        String str=sc.nextLine();
        int i=str.indexOf(".");
        String str1=str.substring(0, i);

        switch (str1) {
            case "http" :
                System.out.println("this is Hyper Text Transfer Protocol");
                break;
            case "ftp" :
                System.out.println("this is File Transfer Protocol");
                break;
            default:
                System.out.println("this is an other url");
                break;
        }


        int l=str.lastIndexOf(".");
        String str2=str.substring(l+1, str.length());

        switch (str2) {
            case "com":
                System.out.println("this is a Commerical url");
                break;
            case "org":
                System.out.println("this is an Organisation url");
                break;
            case "gov":
                System.out.println("this is a Government url");
                break;
            default:
                System.out.println("this is an other url");
                break;
        }
        
    }
}
