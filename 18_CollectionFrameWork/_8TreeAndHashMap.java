import java.util.*;
// import java.util.TreeMap;


public class _8TreeAndHashMap {
    public static void main(String[] args) {
        // TreeMAp provide unordered set ..give in shorted way
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(1,"A",2,"B",3,"C"));

        tm.put(4, "D");
        tm.put(6,"F");
        tm.put(5,"E");

        System.out.println(tm);
        System.out.println(tm.keySet());

        tm.put(11,"K");
        System.out.println(tm.ceilingEntry(8));

        System.out.println(tm.get(4));

        System.out.println(tm.firstEntry());

        System.out.println(tm.remove(4));
        System.out.println(tm);

        tm.forEach((K,V)->System.out.println(K+"->"+V));

        // and many more functions to try..



        // // HashMap() is similar to the treeMap() withe less method 
        // // hashmap provide unordered set ..give in shorted way
        // HashMap<Integer,String> tm=new HashMap<>(Map.of(1,"A",2,"B",3,"C"));

        // tm.put(6,"F");
        // tm.put(4, "D");
        // tm.put(5,"E");

        // System.out.println(tm);
        // System.out.println(tm.keySet());

        // // tm.put(11,"K");
        // // System.out.println(tm.ceilingEntry(8));

        // System.out.println(tm.get(4));

        // // System.out.println(tm.firstEntry());

        // System.out.println(tm.remove(4));
        // System.out.println(tm);

        // // and many more functions to try..
    }
}
