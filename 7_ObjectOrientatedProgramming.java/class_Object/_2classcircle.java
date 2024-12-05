// package class_Object;
import java.util.*;
class circle{                                       //Write a class for circle
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumfernce(){
        return perimeter();
    }
}

public class _2classcircle {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        circle c=new circle();                       //calling of class (object creation)
        
        System.out.println("Enter the RAdius :");
        c.radius=sc.nextInt();
        
        System.out.println("Area :"+c.area());
        System.out.println("Perimeter:"+c.perimeter());
        System.out.println("Circumference :"+c.circumfernce());

        // circle c1=new circle();            //also we can use same class for more than one circle ,with creating another object
        // c1.radius=10;
        // System.out.println("Area :"+c1.area());
        // System.out.println("Perimeter:"+c1.perimeter());
        // System.out.println("Circumference :"+c1.circumfernce());
    }
}
