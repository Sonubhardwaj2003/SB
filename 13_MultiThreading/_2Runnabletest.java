class My implements Runnable{
    public void run(){
        @SuppressWarnings("unused")
        int i=1;
        while(true){
            System.out.println("Hello! ");
            i++;
        }
    }
}

public class _2Runnabletest {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        My m=new My();
        Thread t=new Thread(m);
        t.start();

        int i=1;
        while(true){
            System.out.println("Java! ");
            i++;
        } 
    }
}





// public class _2Runnabletest implements Runnable {
//     public void run(){
//         @SuppressWarnings("unused")
//         int i=1;
//         while(true){
//             System.out.println("Hello! ");
//             i++;
//         }
//     }

//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
//         _2Runnabletest r=new _2Runnabletest();
//         Thread t=new Thread(r);
//         t.start();

//         int i=1;
//         while(true){
//             System.out.println("Java! ");
//             i++;
//         } 
//     }
// }