// Generalization , means introducing a new class by combining of sub classes  ,eg. we talk about departments ,colleges etc        Generalization = Interface/polimorphism
// Specialization ,means adding new features to creation new class from the existing class.eg adding new feature to cirlcle make cylinder.      Specializarion = Inheritence

// package 8_inheritence;
class Circle{
    public double radius;

    public Circle(){
        radius=20;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class Cylinder extends Circle{
    public double height;

    public Cylinder(){
        height=10;
    }

    public double volume(){
        return area()*height;
    }
    public double area(){
        return perimeter()*(radius+height);
    }
}

public class _1ciecleAndClynder {
    public static void main(String[] args) {
        Circle c=new Circle();
        Cylinder c1=new Cylinder();

        // c.radius=15;
        // c1.height=5;

        System.out.println("radius : "+c.radius);
        System.out.println("Height : "+c1.height);

        System.out.println("Area of circle : "+c.area());
        System.out.println("Perimeter of circle : "+c.perimeter());

        System.out.println("volume of cylinder : "+c1.volume());
        System.out.println("Area of cylinder : "+c1.area());

    }
}
