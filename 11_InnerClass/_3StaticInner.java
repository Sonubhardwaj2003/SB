// Static inner class is same as neasted class ,the main difference is that here we can access only those members of outer class in inner class which are static ,where in nested class we can access all the member . and also the inner class is staic.

class Outer
{
    static int x=10;
    int y=20;
    
    static class Inner
    {
        void innerDisplay()
        {
            System.out.println(x);
            // y is not accessable.but if we done y as static it is also accessable.
            // System.out.println(y);
        }
    }

    public void outerDisplay(){

        Inner i=new Inner();
        i.innerDisplay();
    }
}

public class _3StaticInner {
    public static void main(String[] args) 
    {
        // Outer.Inner oi=new Outer.Inner();
        // oi.innerDisplay();
        // System.out.println(oi.y);

        Outer o=new Outer();
        o.outerDisplay();
    }
}

