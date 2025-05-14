import java.util.*;
public class _6TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>(List.of(10,20,50,40,30));
        t.add(10);
        // provide the shorted list of element
        System.out.println(t);


        // SortedSet<Integer> t=new TreeSet<>(List.of(10,20,50,40,30));
        // t.add(100);
        // System.out.println(t);

        System.out.println(t.reversed());
        // ceiling provide the integre which is in list nearest-greater to the given integer
        System.out.println(t.ceiling(15));
        System.out.println(t.descendingSet());

        // and many more functions.
    }
}
