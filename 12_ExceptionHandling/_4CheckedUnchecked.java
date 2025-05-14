public class _4CheckedUnchecked {

    // static void fun1(){
    //     System.out.println(10/0);
    // }
    // static void fun2(){
    //     fun1();
    // }
    // static void fun3(){
    //     fun2();
    // }
    // public static void main(String[] args) {
    //     fun3();
    // }


    static void fun1(){
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }
    public static void main(String[] args) {
        fun3();
    }

}



// // here we define our own exception.
// class  lowbalanceException extends Exception{
//     public String toString(){
//         return "balance does not less than 5000";
//     }    
// }
// public class _4CheckedUnchecked {

//     static void fun1(){
//         try {
//             throw new lowbalanceException();
//         } 
//         catch (lowbalanceException e) {
//             System.out.println(e);
//         }
        
//     }
//     static void fun2(){
//         fun1();
//     }
//     static void fun3(){
//         fun2();
//     }
//     public static void main(String[] args) {
//         fun3();
//     }
// }

 