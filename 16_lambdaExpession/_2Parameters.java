@FunctionalInterface
interface myLembda{
    public int  add(int x,int y);
}

public class _2Parameters {
    public static void main(String[] args) {
        // myLembda m = (a,b) ->{return a+b;};
        myLembda m = (a,b) ->a+b;
        // even we can return over statement without the use of return keyword.
        int res=m.add(20, 10);
        System.out.println(res);
    }
}
