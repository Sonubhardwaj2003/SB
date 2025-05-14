abstract class shape{
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape{
    public double radius=10;
    
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

class rectangle extends shape{
    public double length=20;
    public double breadth=30;

    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}

public class _2shape {
    public static void main(String[] args) {
        
        shape c=new circle();
        
        System.out.println("Circle : ");
        System.out.println("Area : "+c.area());
        System.out.println("Perimeter : "+c.perimeter());

        shape r=new rectangle();

        System.out.println("Rectangle : ");
        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());
    }
}