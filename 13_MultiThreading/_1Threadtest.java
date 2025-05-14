// 1st ethod of multithreading is to make to class as ,one is main and second is thread extends class.
class Mythread extends Thread{
    public void run(){
        @SuppressWarnings("unused")
        int i=1;
        while(true){
            System.out.println("Hello! ");
            i++;
        }
    }
}

public class _1Threadtest {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Mythread mt=new Mythread();
        mt.start();

        int i=1;
        while(true){
            System.out.println("Java! ");
            i++;
        } 
    }
}



// // 2nd method of multithreading is to make the main class as a thread;
// public class _1Threadtest extends Thread {
//     @SuppressWarnings("unused")
//     public void run(){
//         int i=1;
//             while(true){
//             System.out.println("Hello! ");
//             i++;
//             }
//         }
//     public static void main(String[] args) {
//         _1Threadtest mt=new _1Threadtest();
//         mt.start();

//         @SuppressWarnings("unused")
//         int i=1;
//         while(true){
//             System.out.println("Java! ");
//             i++;
//         } 
//     }
// }