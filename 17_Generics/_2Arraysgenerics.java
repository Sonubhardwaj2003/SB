
// class Generics1<T>{
//     @SuppressWarnings("unchecked")
//     T A[]=(T[])new Object[10];

//     int length=0;
//     public void show(T v){
//         A[length++]=v;
//     }

//     public void display(){
//         for(int i=0;i<length;i++){
//             System.out.println(A[i]);
//         }
//     }
// }

// public class _2Arraysgenerics {
//     public static void main(String[] args) {
//         Generics1<Integer> i=new Generics1<>();
        
//         i.show(10);
//         i.show(20);
//         i.show(30);

//         i.display();
//     }
// }




// // 1.with no perameters,it will take any type of value 
// class Generics1<T>{
//     @SuppressWarnings("unchecked")
//     T A[]=(T[])new Object[10];

//     int length=0;
//     public void show(T v){
//         A[length++]=v;
//     }

//     public void display(){
//         for(int i=0;i<length;i++){
//             System.out.println(A[i]);
//         }
//     }
// }

// public class _2Arraysgenerics {
//     @SuppressWarnings({ "unchecked", "rawtypes" })
//     public static void main(String[] args) {
//         Generics1 i=new Generics1<>();
//         // no perameters
//         i.show(10);
//         i.show(20);
//         i.show("hello !java");

//         i.display();
//     }
// }






// 2.with perameters,it will take any type of value as given the parameters i.e. for Strings,Integers ,means u can take  multiple parameters.
// class Generics1<T,K>{
//     @SuppressWarnings("unchecked")
//     T A[]=(T[])new Object[10];

//     int length=0;
//     public void show(T v){
//         A[length++]=v;
//     }

//     public void display(){
//         for(int i=0;i<length;i++){
//             System.out.println(A[i]);
//         }
//     }
    
//     public void show(String string) {
//         System.out.println(string);
//     }
// }

// public class _2Arraysgenerics {
//     @SuppressWarnings({ })
//     public static void main(String[] args) {
//         Generics1<Integer,String> i=new Generics1<>();
//         // no perameters
//         i.show(10);
//         i.show(20);
//         i.show("hello !java");

//         i.display();
//     }
// }




//3.Subtype
class Generics1<T>{
    @SuppressWarnings("unchecked")
    T A[]=(T[])new Object[10];

    int length=0;
    public void show(T v){
        A[length++]=v;
    }

    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
    
}
class myGen<T> extends Generics1<T>{

}
public class _2Arraysgenerics {
    @SuppressWarnings({ })
    public static void main(String[] args) {
        myGen<Integer> i=new myGen<>();
        // no perameters
        i.show(10);
        i.show(20);
        i.show(30);

        i.display();
    }
}