import java.util.*;
@SuppressWarnings("rawtypes")
class Point implements Comparable{
    int x;
    int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return x+"|"+y;
    }

    @Override
    public int compareTo(Object o){
        Point p=(Point)o;
        if(x<p.x){
            return -1;
        }
        else if(x>p.x){
            return 1;
        }
        else{
            if(y<p.y){
                return -1;
            }
            else if(y>p.y){
                return 1;
            }
            else
                return 0;
        }
    }

}
public class _7CompareableInterface {
    public static void main(String[] args) {
        TreeSet<Point> ts=new TreeSet<>();

        ts.add(new Point(1, 2));
        ts.add(new Point(1, 1));
        ts.add(new Point(3, 2));
        ts.add(new Point(1, 0));
        ts.add(new Point(2, 2));

        System.out.println(ts);
    }
}
