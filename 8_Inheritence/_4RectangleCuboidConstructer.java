class rectangle{
    public double length;
    public double breadth;

    public rectangle(){
        length=breadth=1;
    }
    public rectangle(double l,double b){
        length=l;
        breadth=b;
    }
}

class cuboid extends rectangle{
    public double height;

    public cuboid(){
        height=10;
    }
    public cuboid(double h){
        height =h;
    }
    public cuboid(double l,double b,double h){
        super(l, b);
        height=h;
    }

    public double volume(){
        return length*breadth*height;
    }
}


public class _4RectangleCuboidConstructer {
    public static void main(String[] args) {
        cuboid c=new cuboid();
        System.out.println("length : "+c.length);
        System.out.println("Breadth : "+c.breadth);
        System.out.println("heigt : "+c.height);
        System.out.println("Volume : "+c.volume());

        System.out.println("----------------");

        cuboid cp=new cuboid(15);
        System.out.println("length : "+cp.length);
        System.out.println("Breadth : "+cp.breadth);
        System.out.println("heigt : "+cp.height);
        System.out.println("Volume : "+cp.volume());

        System.out.println("----------------");

        cuboid cpp=new cuboid(15,10,5);
        System.out.println("length : "+cpp.length);
        System.out.println("Breadth : "+cpp.breadth);
        System.out.println("heigt : "+cpp.height);
        System.out.println("Volume : "+cpp.volume());
    }
}
