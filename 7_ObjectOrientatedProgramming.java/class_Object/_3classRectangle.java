// package class_Object;
import java.util.*;
class Rectangle{
    public int breadth;
    public int length;

    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
    public boolean Issquare(){
        if(length==breadth)
            return true;
        else
           return false;
    }
}

public class _3classRectangle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        Rectangle r=new Rectangle();

        System.out.println("Enter the length of rectangle :");
        r.length=sc.nextInt();

        System.out.println("Enter the breadth of rectangle :");
        r.breadth=sc.nextInt();

        System.out.println("Area is : "+r.area());
        System.out.println("Perimeter is : "+r.perimeter());
        System.out.println("it is a square : "+r.Issquare());
    }
}
