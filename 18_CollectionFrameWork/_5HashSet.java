import java.util.HashSet;

public class _5HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        // hashset doesnot allowed duplicate value.and give output in any order
        hs.add(10);
        hs.add(5);
        hs.add(20);
        hs.add(10);
        hs.add(30);

        System.out.println(hs);

        System.out.println(hs.hashCode());
        System.out.println(hs.remove(10));
        System.out.println(hs);

    }
}
