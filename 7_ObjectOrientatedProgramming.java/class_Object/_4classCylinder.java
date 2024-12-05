// package class_Object;
import java.util.Scanner;

class Cylinder{
    public double radius;
    public double height;
    
    public double surfacearea(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double lidearea(){
        return Math.PI*radius*radius;
    }
}

public class _4classCylinder {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        Cylinder C=new Cylinder();

        System.out.println("Enter the radius of Cylinder :");
        C.radius=sc.nextDouble();

        System.out.println("Enter the height of Cylinder :");
        C.height=sc.nextDouble();

        System.out.println("Surfacearea is : "+C.surfacearea());
        System.out.println("Volume is : "+C.volume());
        System.out.println("Lidarea is : "+C.lidearea());
    }
}
