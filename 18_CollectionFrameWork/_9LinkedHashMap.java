import java.util.*;

public class _9LinkedHashMap {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // LinkedHashMap provide the output in the order in which they are insert or accesss.means it  provide ordered output.
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1, "A");
        lhm.put(5,"E");
        lhm.put(3,"C");
        lhm.put(2,"B");
        lhm.put(4,"D");
        System.out.println(lhm);
        lhm.forEach((K,V)->System.out.println(K+"->"+V));


        // LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true);
        // // if we are want to print the key-vaues  in order as i  which they are access then use true.
        // lhm.put(1, "A");
        // lhm.put(2,"B");
        // lhm.put(3,"C");
        // lhm.put(4,"D");
        // lhm.put(5,"E");
        // String s=lhm.get(2);
        // s=lhm.get(5);
        // System.out.println(lhm);
        // lhm.forEach((K,V)->System.out.println(K+"->"+V));



        // // As we lnow the in collection framework there is no nedd tom provide the limit ,it increase its space or capicty according to the given situation or the enteries...But is want to set the ,imit in the linkedHashMap then use the method removeEldestEntry(Map.Entry e).
        // LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true){
        //     @SuppressWarnings("rawtypes")
        //     protected boolean removeEldestEntry(Map.Entry e) {
        //         // it can remove the set based on the Least Recently uses|accessed or based on the first insertion 
        //         return size()>5;
        //     }
        // };
        // lhm.put(1, "A");
        // lhm.put(2,"B");
        // lhm.put(3,"C");
        // lhm.put(4,"D");
        // lhm.put(5,"E");
        // String s=lhm.get(2);
        // s=lhm.get(5);
        // lhm.put(6,"G");
        // // calling of 6 is removing the 1-A key value pair as they are least recently used or accessed
        // System.out.println(lhm);
        // lhm.forEach((K,V)->System.out.println(K+"->"+V));
    }
}
