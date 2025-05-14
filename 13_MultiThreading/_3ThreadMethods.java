// class myMethods extends Thread{
//     public myMethods(String name){
//         super(name);
//     }
// }

// public class _3ThreadMethods {
//     @SuppressWarnings({ "deprecation", "static-access" })
//     public static void main(String[] args) {
//         myMethods t=new myMethods("Sonu bhardwaj Threads ");

//         System.out.println("Name :"+t.getName());
//         System.out.println("ID :"+t.getId());
//         System.out.println("Priorities :"+t.getPriority());
//         System.out.println(t.getState().RUNNABLE);
//         System.out.println(t.isAlive());
//         System.out.println(t.isDaemon());
//         System.out.println(t.isInterrupted());
//         System.out.println(t.getThreadGroup());
//         t.setPriority(t.MAX_PRIORITY);
//         t.setName("Ram");
//         System.out.println(t.getName());
//         System.out.println(t.getPriority());
//     }
// }



// //Sleep and interepted methods.
// class myMethods extends Thread{
//     public myMethods(String name){
//         super(name);
//     }
    
//     public void run(){
//         int i=1;
//         while(true){
//             System.out.println(i);
//             i++;
            // try {
            //     Thread.sleep(500);
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
        
//         }
//     }
    
// }
// public class _3ThreadMethods {
   
//     public static void main(String[] args) {
//         myMethods t=new myMethods("Sonu bhardwaj Threads ");
        
//         // System.out.println(t.getName());
//         t.start();
//         // t.interrupt();
//     }
// }



// // Deamon and join methods.
// class myMethods extends Thread{
    
//     public void run(){
//         int i=1;
//         while(true){
//             System.out.println(i);
//             i++;
            
//         }
//     }
    
// }
// public class _3ThreadMethods {
   
//     public static void main(String[] args)  {
//         myMethods t=new myMethods();
        
//         // t.setDaemon(true);
//         // // deamon stopt the execution and terminate with the main methode ,flow of main is not come on start() methode.
//         // t.start();


//         // t.setDaemon(true);
//         // // this time execite the start() methode , printing the thread till , given sleep methode seconds.
//         // t.start();
//         // try {
//         //     Thread.sleep(100);
//         // } catch (Exception e) {
//         //     System.out.println(e);
//         // }


//         t.setDaemon(true);
//         t.start();
//         try {
//             t.join(10);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }




//yield methods. ,this method prints the hloooo mesaggess less time then the javaaa message ,creates a big difference, and whithout yiels method,no.of hlooo and java message is approx same the print simutaneously.
class myMethods extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Javaaaa !");
            i++;
        }
    }
    
}
public class _3ThreadMethods {
   
    public static void main(String[] args) {
        myMethods t=new myMethods();
        t.start();
        
        int i=1;
        while(true){
            System.out.println(i+" hloooooo!");
            i++;
            Thread.yield();
        }
    }
}