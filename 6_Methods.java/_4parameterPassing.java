//example for parameter passing 
//only one method is to passing parameter is that coping of actual parametr to formal parameter
//i.e in c and c++ call by value and call by address

import java.util.*;

public class _4parameterPassing {
    //method  defination here /Method called
    static int sum(int a,int b)      //formal parameter (copied actual parameter)
    {
            int c;                  //call by value.
            c=a+b;                   //values of x and y copied to a and b And then sum to c...And the c to  z.  
            return c;
    }

    //method calling
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the value of a :");
        x=sc.nextInt();
        System.out.println("Enter the value of b :");
        y=sc.nextInt();
        z=sum(x, y);                                     //actual parameter
        System.out.println("Sum is :"+z);
    }
}


// import java.util.*;

// public class _4parameterPassing {
//     //method  defination here /Method called
//     static void Welcome(String n)      //formal parameter (copied actual parameter)
//     {                                               //call by Address
//         System.out.println("Welcome Mr. "+n);      //Address of name Coppied to n.
//     }         

//     //method calling
//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc=new Scanner(System.in);
//         String name;                                     
//         System.out.println("Enter name ");
//         name=sc.nextLine();
//         Welcome(name);                                                //actual parameter
//     }
// }