//String is the collection of character
//Methods to print a strings
public class str1{
    public static void main(String[] args) {
        String str1="Sonu bhardwaj";                        //Method 1.
        // class=String
        //variable\refrence=str1
        //Literal\object code=Sonu bhardwaj (inside string pool area " ")
        System.out.println(str1);

        String str2=new String("Sonu bhardwaj");     //Method 2.
        //String()=Constructer   >> A function having same name as the class name called Constructer
        //Literal= created\hold in Heap area as we are give "new"
        System.out.println(str2);

        char c[]={'H','e','l','l','o'};                     //Method 3.  
        String str3=new String(c);
        // String str3=new String(c,1,3);
        // offset= Starting from which index value 
        // Count= Number of letter u want to print
        System.out.println(str3);

        byte b[]={65,66,67,68,69,70};                         //Method 4.
        String str4=new String(b);
        // String str4=new String(b,2,3);
        // offset= Starting from which index value 
        // length= Number of letter u want to print
        System.out.println(str4);
    }
}
