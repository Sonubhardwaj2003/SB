// Interface ,is  an abstract class contain all the abstract method.
// Aim of Interface is to achive Polimorphism (generalization) ,run time 
//  Interface is implements,while abstract class is extends ,but an interface class can also be extendes which have its own abstract method .
// an interface class ,abstract method can be body if it is static i.e meth3
// this method(meth3) can be accessible directly in our main class without creating the objets,cannot be called using the object creation .
// an interface class have also contain default methods i.e meth5 ,if we are working on the big projects and if we are add new method to our interace class then we use default mrethod ,it doesnot distrub the implements class, and it is called using the object created of our impilements class ,not called directly. 
// instead of multiple inheritence ,jave uses interfaces
// interface can a private method also.


// package 10_Interface;

interface test {
    final static int x=10;
    void meth1();
    void meth2();

    public static void meth3(){
        System.out.println("abc");
    }

    default void meth5(){
        System.out.println("meth5");
    }
}      

interface test2 extends test{
    void meth4();
}

class my implements test{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
}

class my1 implements test2{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class _0basicOfInterface {
    public static void main(String[] args){
        test.meth3();
        System.out.println(test.x);

        my sc=new my();

        sc.meth1();
        sc.meth2();

        test tc=new my();
        //  Dyanmic method Dispatch
        tc.meth1();
        tc.meth2();
        tc.meth5();

        my1 sc1=new my1();

        sc1.meth1();
        sc1.meth2();
        sc1.meth4();
    }
}
