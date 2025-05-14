// package 17_Generics;
class Generics<T>{
    private T obj;

    public void setData(T v){
        obj=v;
    }

    public T getData(){
        return obj;
    }
}
public class _1objectGeneric {
    public static void main(String[] args) {
        // Generics<Integer> i=new Generics<>();
        // i.setData(10);
        // System.out.println(i.getData());

        Generics<String> i=new Generics<>();
        i.setData("Hlo java!");
        System.out.println(i.getData());
    }
}
