class Cylinder{

    //properties
    private double radius;
    private double height;

    //constructer
    public Cylinder(){
        radius=15;
        height=10;
    }
    public Cylinder(double radius,double height){
        setRadius(radius);
        setHeight(height);
    }

    //getter method
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    //setter method
    public void setRadius(double r){
        if (r>0) {
            radius=r;
        }
        else
            radius=0;
    }
    public void setHeight(double h){
        if (h>0) {
            height=h;
        }
        else
           height=0;
    }

    //fecilates  or behaviour
    public double surfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double lidArea(){
        return 2*radius*radius*Math.PI;
    }

}

public class _3cylinder {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        // Cylinder c=new Cylinder(10,15);

        System.out.println("Radiud : "+c.getRadius());
        System.out.println("height : "+c.getHeight());

        System.out.println("SurfaceArea : "+c.surfaceArea());
        System.out.println("Volume ; "+c.volume());
        System.out.println("Lid Area : "+c.lidArea());
    }
}
