import java.util.Comparator;
import java.util.PriorityQueue;
// // For Min Heap
// public class _4PriorityQueue {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq=new PriorityQueue<>();

//         // priority queue work same as the heap(min  heap);(for each ,Parent element < child element)

//         pq.add(10);
//         pq.add(5);
//         pq.add(1);
//         pq.add(15);
//         pq.add(60);
//         pq.add(3);
//         pq.add(30);
//         pq.add(20);

//         System.out.println("Before deleting :");
//         pq.forEach((x)->System.out.print(x+","));
//         System.out.println();

//         pq.poll();
//         pq.poll();

//         System.out.println("After deleting :");
//         pq.forEach((x)->System.out.print(x+","));

//     }
// }



// For Max Heap
class mycom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }
}
public class _4PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new mycom());

        pq.add(10);
        pq.add(5);
        pq.add(1);
        pq.add(15);
        pq.add(60);
        pq.add(3);
        pq.add(30);
        pq.add(20);

        System.out.println("Before deleting :");
        pq.forEach((x)->System.out.print(x+","));
        System.out.println();

        pq.poll();
        pq.poll();

        System.out.println("After deleting :");
        pq.forEach((x)->System.out.print(x+","));

    }
}
