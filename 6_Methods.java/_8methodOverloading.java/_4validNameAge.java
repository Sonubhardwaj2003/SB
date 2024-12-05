import java.util.*;
public class _4validNameAge {
    static  boolean valid(String Str){
        if(Str.matches("[A-Za-z\\s]+")){
            return true; 
        }
        else{
            return false;
        }
    }
    static int valid(int age){
        if(age>3 && age<16){
           System.out.println("Age is valid to take addimission in school"); 
        }
        else{
            System.out.println(("Age is not valid to take addimission in school"));
        }
        return age;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String Str;
        System.out.println("Enter a name :");
        Str=sc.nextLine();
        System.out.println("IS this name is valid :");
        System.out.println(valid(Str));

        int age;
        System.out.println("Enter the age of student");
        age=sc.nextInt();
        valid(age);
    }
}
