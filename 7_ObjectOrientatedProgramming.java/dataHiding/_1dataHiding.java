// Data hiding is a fundamental concept in object-oriented programming (OOP) that involves restricting access to the internal details of an object. This technique ensures that the data within a class is not directly accessible from outside the class, thereby maintaining data integrity and security

// package dataHiding;
class Rectangle{
    private double length;
    private double breadth;

    //getter mathod for ead the value
    public double getlength(){
        return length;
    } 
    public double getBreadth(){
         return breadth;
    }

    //setter method for write the value .
    public void setLength(double l){
        if (l>0) {
            length=l;
        }
        else
           length=0;
    }
    public void setBreadth(double b){
        if (b>0) {
            breadth=b;
        }
        else
           breadth=0;
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }

}

public class _1dataHiding {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();

        r.setLength(10);
        r.setBreadth(5.5);

        System.out.println("Length : "+r.getlength());
        System.out.println("Breadth : "+r.getBreadth());

        System.out.println("Area : "+r.area());
        System.out.println("perimeter : "+r.perimeter());
    }
}
