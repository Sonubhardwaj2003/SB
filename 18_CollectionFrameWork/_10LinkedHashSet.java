import java.util.*;

public class _10LinkedHashSet {
    public static void main(String[] args) {
        // Hash doesnott allow the duplicate values
        // LinkedHashSet provide the output in ordered way..as they are insert 
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();

        lhs.add(1);
        lhs.add(5);
        lhs.add(4);
        lhs.add(2);
        lhs.add(4);
        lhs.add(3);

        System.out.println("Output for LinkedhashSet :");
        System.out.println(lhs);
        lhs.forEach(System.out::println);
        System.out.println(lhs.reversed());
        
        lhs.toArray();
        System.out.println(lhs);

        for(int i=0;i<lhs.size();i++){
            System.out.println(lhs.toArray()[i]);
        }
        // System.out.println("*******************");

        // // while hashSet provide the output in sorted way
        // HashSet<Integer> hs=new HashSet<>();

        // hs.add(1);
        // hs.add(5);
        // hs.add(4);
        // hs.add(2);
        // hs.add(3);
        // hs.add(4);

        // System.out.println("Output for HashSet :");
        // System.out.println(hs);
        // hs.forEach(System.out::println);
    }
}
