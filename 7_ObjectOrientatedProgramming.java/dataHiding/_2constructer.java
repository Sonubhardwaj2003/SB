//Constructer ,is a method of a class which is automatically called when you creating an object
//they have same name as class name
//they do not have any return type 
//generally they are public ,but we can make them private also
//A onstructer can be define with or without parameter.
class  Rectangle{

    //properties
    private double length;
    private double breadth;

    public Rectangle(){ //non-parameterise constructer
        length=10;
        breadth=5;
    }
    public Rectangle(double l,double b){  //parameterise constructer
        setLength(l);
        setBreadth(b);
    }

    //getter mathod for read the value
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

    //fecilaters
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    
}
public class _2constructer {
    public static void main(String[] args) {
        //object code for class Rectangle
        // Rectangle r=new Rectangle(); //for non-parameterise constructer
        Rectangle r=new Rectangle(5,10); //for parameterise constructer

        // calling
        System.out.println("Length : "+r.getlength());
        System.out.println("Breadth : "+r.getBreadth());

        System.out.println("Area : "+r.area());
        System.out.println("perimeter : "+r.perimeter());
    }
}
