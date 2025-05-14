// DMD is when the refrence of super class is holding object of sub class on overrided method

class superb{
    public void method1(){
        System.out.println("super method 1");
    }
    public void method2(){
        System.out.println("super method 2");
    }
}
class sub extends superb{
    @Override
    public void method2(){
        System.out.println("sub method 2");
    }
    public void method3(){
        System.out.println("sub method 3");
    }
}
public class _7DynamicMethodDispatch {
    public static void main(String[] args) {
        superb sp=new superb();
        sp.method1();
        sp.method2();

        sub sub=new sub();
        sub.method1();
        sub.method2();
        sub.method3();

        superb s=new sub();
        s.method1();
        s.method2();
        // s.method3();
        // not calling method three as it has no refrence to the method 3;it has only refrence of method 1 and 2
    }
}
