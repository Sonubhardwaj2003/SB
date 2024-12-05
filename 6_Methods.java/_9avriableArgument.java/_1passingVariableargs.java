public class _1passingVariableargs {
    static void showString(String ...str) {
        for(int i=0;i<str.length;i++){
            System.out.println(i+1+" "+str[i]);
        }
    }
    public static void main(String[] args) {
        showString("null");
        showString("Sonu","Harsh","Aswani","Harshit","Sarthak","Ronit","Himanshu");
        
    }
}



// public class _1passingVariableargs {
//     static void showString(int start,String ...str) {
//         for(int i=0;i<str.length;i++){
//             System.out.println(start+" "+str[i]);
//             start++;
//         }
//     }
//     public static void main(String[] args) {
//         showString(1,"null");
//         showString(5,"Sonu","Harsh","Aswani","Harshit","Sarthak","Ronit","Himanshu");
        
//     }
// }


//Variable arguments must be written in last. else it give an error i.e.
// public class _1passingVariableargs {
//     static void showString(String ...str,int start) {
//         for(int i=0;i<str.length;i++){
//             System.out.println(start+" "+str[i]);
//             start++;
//         }
//     }
//     public static void main(String[] args) {
//         showString("null",1);
//         showString("Sonu","Harsh","Aswani","Harshit","Sarthak","Ronit","Himanshu",5);
        
//     }
// }