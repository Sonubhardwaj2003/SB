// An inner class is used to reduce the time and space complicity of a class .This is the same concept like the C++,global declration.

// package 11_InnerClass;


// Nested Ineer class ,one class inside the another class
class Outer
{
    int x=10;
    // we can also create this object of inner class inside the outer class method ,outerDisplay
    Inner i=new Inner();
    
    class Inner
    {
        // all the properties i.e x=10; is accessable inside the inner call ,
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay()
    {
        // Inner i=new Inner();
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class _1nestedInner {

    public static void main(String[] args) 
    {
        Outer o=new Outer();
        o.outerDisplay();

        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();
        System.out.println(oi.y);
    }
    
}