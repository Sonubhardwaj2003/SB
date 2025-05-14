import java.util.ArrayDeque;

public class _3ArrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.offerLast(10);
        ad.offerLast(20);
        ad.offerLast(30);
        ad.offerLast(40);
        ad.offerLast(50);

        ad.offerFirst(1);
        ad.offerFirst(2);
        ad.offerFirst(3);
        ad.offerFirst(4);
        ad.addFirst(5);

        ad.pollFirst();
        ad.pollFirst();
        ad.pollLast();

        // for(var x:ad){
        //     System.out.println(x);
        // }

        // for (Integer x : ad) {
        //     System.out.println(x);
        // }

        ad.forEach((x)->System.out.print(x+","));
        
    }
}
