// // simple without exception
// public class _5ThrowAndThrows {
//     static int area(int l,int b) {
//         return  l*b;
//     }

//     static void meth1(){
//        System.out.println(area(10,5));
//     }

//     public static void main(String[] args) {
//         meth1();
//     }
// }



// //with exception ,l and b cnanot less than zero;
// public class _5ThrowAndThrows {
//     static int area(int l,int b) throws Exception {
//         if(l<=0 || b<=0){
//             throw new Exception();
//         }
//         return  l*b;
//     }

//     static void meth1() throws Exception{
//        System.out.println(area(-10,5));
//     }

//     static void meth2() throws Exception{
//         meth1();
//     }

//     public static void main(String[] args) throws Exception {
//         meth1();
//     }
// }


// import java.util.*;
// public class _5ThrowAndThrows {
//     static int area(int l,int b) throws Exception {
//         if(l<=0 || b<=0){
//             throw new Exception();
//         }
//         return  l*b;
//     }

//     static void meth1() throws Exception{
//         @SuppressWarnings("resource")
//         Scanner read=new Scanner(System.in);
//         System.out.println("Eneter values for a And b :");
//         int a=read.nextInt();
//         int b=read.nextInt();
//         System.out.println("Area is :"+area(a,b));
//     }

//     static void meth2() throws Exception{
//         meth1();
//     }

//     public static void main(String[] args)  {
//         // we can handle this exception in any method 
//         try {
//             meth1();
//         } catch (Exception e) {
//             System.out.println("Length and breadth cannot be Zero or less the Zero :"+e);
//         }
//     }
// }



// with own defination to string.
import java.util.*;
class negativeException extends Exception{
    public String toString(){
        return "No area,as length and breadth Cannot be negative or zero";
    }
}
public class _5ThrowAndThrows {
    static int area(int l,int b) throws negativeException {
        if(l<=0 || b<=0){
            throw new negativeException();
        }
        return  l*b;
    }

    static void meth1() throws negativeException{
        @SuppressWarnings("resource")
        Scanner read=new Scanner(System.in);
        System.out.println("Eneter values for a And b :");
        int a=read.nextInt();
        int b=read.nextInt();
        System.out.println("Area is :"+area(a,b));
    }

    static void meth2() throws negativeException{
        meth1();
    }

    public static void main(String[] args)  {
        // we can handle this exception in any method 
        try {
            meth1();
        } catch (negativeException e) {
            System.out.println(e);
        }
    }
}