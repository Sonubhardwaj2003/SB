//Method overloading is writing more than one method with same name by either differnt data type or differ no. of parameters,but it did not check the return type,if you have same data type and differnt retutn type it will give an error
public class _0methodOverloading {
    
    static byte max(byte x,byte y)
    {
        return x>y?x:y;
    }
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static float max(float x,float y)
    {
        return x>y?x:y;
    }
    static int max(int x,int y,int z)
    {
        return (x>y&&x>z)?x:(y>z?y:z);
    }
    public static void main(String[] args) {
        byte x=5,y=10;
        System.out.println(max(x,y));
        System.out.println(max(10, 20));
        System.out.println(max(5.7f, 20.4f));
        System.out.println(max(10, 04,12));
    }
}
