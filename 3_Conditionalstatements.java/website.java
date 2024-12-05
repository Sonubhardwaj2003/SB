import java.util.*;
public class website {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Url");
        String str=sc.nextLine();
        int i=str.indexOf(".");
        String str1=str.substring(0, i);

        if(str1.equals("http")){
             System.out.println("this is Hyper Text Transfer Protocol");
        }
        else if(str1.equals("ftp")){
            System.out.println("this is File Transfer Protocol");
        }
        else{
            System.out.println("this is an other url");
        }


        int l=str.lastIndexOf(".");
        String str2=str.substring(l+1, str.length());
        
        if(str2.equals("com")){
            System.out.println("this is a Commerical url");
        }
        else if(str2.equals("org")){
            System.out.println("this is an Organisation url");
        }
        else if(str2.equals("gov")){
            System.out.println("this is a Government url");
        }
        else{
            System.out.println("this is an other url");
        }
    }
}