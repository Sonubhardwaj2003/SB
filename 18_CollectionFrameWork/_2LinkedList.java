import java.util.*;

public class _2LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> al1=new LinkedList<>();

        LinkedList<Integer> al2=new LinkedList<>(List.of(30,40,50,60,70,30));

        al1.add(5);
        al1.add(0, 10);
        al1.addAll(al2);
        System.out.println(al1);
        System.out.println("**********");

        // we can apply all the methods of ArrayList in LinkedList,also with some extra methods .

        System.out.println(al1.peek());
        System.out.println(al1.peekFirst());
        System.out.println(al1.peekLast());
        System.out.println("**********");

        System.out.println(al1.get(3));
        System.out.println(al1.getFirst());
        System.out.println(al1.getLast());
        System.out.println("**********");

        System.out.println(al1.poll());
        System.out.println(al1);
        System.out.println(al1.pollFirst());
        System.out.println(al1.pollLast());
        System.out.println(al1);
        System.out.println(al1.remove(4));
        System.out.println(al1);
        System.out.println("**********");

        System.out.println(al1.offerFirst(50));
        System.out.println(al1);
        System.out.println(al1.offerLast(10));
        System.out.println(al1);

        // and many more methods
    }
}
