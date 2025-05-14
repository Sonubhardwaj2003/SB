// Abstract class , means its object cannot be created,but when required we can create. an abstract class has Zero or more than Zero Abstract method ,if class has Zero abstract method then it will also an abstract class.if there is any abstract method in the class then the class must be need to be abstract . it is usefull to defining and imposing the standards.
// Abstract method ,its definaion is not defined ...it is undefined,method which has no defination.
// Concerete class , also called the sub class which is extends from the super or Abstract class.and a concreate class must have all the methods of the abstract class (overrided).


abstract class main{
    public main(){
        System.out.println("Abstruct constructer");
    }
    public void meth1(){
        System.out.println("Main meth1");
    }
    abstract public void meth2();
}
class small extends main{
    @Override
    public void meth2(){
        System.out.println("Small meth2");
    }
}

public class _1basicAbstract {
    public static void main(String[] args) {
        // object is not created for abstract class,if it create then give an error
        // main m=new main();
        // main ma = null;
        
        
        main m=new small();
        m.meth1();
        m.meth2();

        small s=new small();
        s.meth1();
        s.meth2();
    }
}
