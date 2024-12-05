
public class _1calculateArea {
    static int area(int l,int b)
    {
        int ans;
        ans=l*b;
        return ans;
    }
    static double area(int r)
    {
        double ans;
        ans=Math.PI*r*r;
        return ans;
    }
    static float area(float h,float b ){
        float ans;
        ans=b*h;
        return ans;
    }
    static float area(float s1,float s2,float h ){
        float ans;
        ans=(s1+s2)*h/2;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("area of rectangle is :"+area(12, 10));
        System.out.println("area of circle is :"+area(7));
        System.out.println("area of parallelogram is :"+area(15f, 9f));
        System.out.println("area of trapizum is :"+area(15f, 9f,4f));
    }
}
