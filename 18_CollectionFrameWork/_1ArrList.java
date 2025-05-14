// package 18_CollectionFrameWork;

import java.util.*;

public class _1ArrList {
    public static void main(String[] args) {
        
        ArrayList<Integer> al1=new ArrayList<>();

        ArrayList<Integer> al2=new ArrayList<>(List.of(30,40,50,60,70,30));

        al1.add(5);
        al1.add(0, 10);
        al1.addAll(al2);
        System.out.println(al1);
        System.out.println("**********");

        al1.addAll(0, al2);
        System.out.println(al1);
        System.out.println("**********");

        System.out.println(al1.contains(10));
        System.out.println(al1.contains(100));
        System.out.println(al1.containsAll(al2));
        System.out.println("**********");

        System.out.println(al1.indexOf(50));
        System.out.println(al1.lastIndexOf(50));
        System.out.println("**********");

        System.out.println(al1.remove(3));
        System.out.println(al1.removeAll(al2));
        System.out.println(al1);
        al1.addAll(0, al2);
        System.out.println(al1);
        System.out.println("*********");

        System.out.println(al1.retainAll(al2));
        System.out.println(al1);
        System.out.println("*********");

        System.out.println(al1.get(3));
        System.out.println(al1.set(3, 10000));
        System.out.println(al1);
        System.out.println("*********");
        
        
        // // Iterator
        // for(int i=0;i<al1.size();i++){
        //     System.out.println(al1.get(i));
        // }

        // for(Integer x:al1){
        //     System.out.println(x);
        // }

        // for(var x:al1){
        //     System.out.println(x);
        // }

        // Iterator<Integer> it=al1.iterator();
        // // hasNext()...jab tak current k agge or next value h tab tak iterate karte rho
        // while(it.hasNext()){
        //     // next()..prints the current value or at present on current value print and jump to next
        //     System.out.println(it.next());
        // }

        // for(Iterator<Integer> it=al1.iterator();(it.hasNext());)
        // {
        //     System.out.println(it.next());
        // }
        // System.out.println("*********");

        
        // // ListIterator
        // ListIterator<Integer> it=al1.listIterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // System.out.println("*********");


        // al1.forEach(x->System.out.println(x));
        // System.out.println("*********");
        // al1.forEach(System.out::println);
        // System.out.println("*********");


    }
}
