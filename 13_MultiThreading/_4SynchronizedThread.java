class MyData{
    // public void display(String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i));
    //     }
    // }

    // synchronized public void display(String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i));
    //     }
    // }
    
    public void display(String str){
        synchronized(this){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
            }
        }
    }
}

class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d){
        this.d=d;
    }

    public void run(){
        d.display("Hello java! , ");
    }
}

class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d){
        this.d=d;
    }

    public void run(){
        d.display("Welcome you .");
    }
}

public class _4SynchronizedThread {
    public static void main(String[] args) {
        MyData m=new MyData();

        MyThread1 t1=new MyThread1(m);
        MyThread2 t2=new MyThread2(m);

        t1.start();
        t2.start();
    }
}
