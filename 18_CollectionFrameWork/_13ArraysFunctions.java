import java.util.Arrays;

public class _13ArraysFunctions {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int a[]={2,4,6,3,1,5,8,9,10};
        int b[]={2,4,6,3,1,5,8,9,10};

        // System.out.println(Arrays.compare(a, b));

        // // int c[]=Arrays.copyOf(a,5);
        // int c[]=Arrays.copyOf(a,a.length);
        // for(int x:c)
        //     System.out.println(x);


        // int c[]=Arrays.copyOf(a,a.length);
        // Arrays.sort(c);
        // for(int x:c)
        //     System.out.println(x);

        
        // int c[]=Arrays.copyOf(a,a.length);
        // Arrays.sort(c);
        // // binarySearch work on the shorted array
        // System.out.println(Arrays.binarySearch(c, 4));


        int c[]=Arrays.copyOf(a,a.length);
        Arrays.fill(c, 10);
        for(int x:c)
            System.out.println(x);
            
    }

    
}




// // for reverse sorting 
// import java.util.Comparator;
// import java.util.*;
// class myComArr implements Comparator<Integer>{
//     public int compare(Integer i1,Integer i2){
//         if(i1<i2){
//             return 1;
//         }
//         else if(i1>i2){
//             return -1;
//         }
//         return 0;
//     }
// }

// public class _13ArraysFunctions {
//     public static void main(String[] args) {
        
//         Integer a[]={2,4,6,3,1,5,8,9,10};
        
//         Arrays.sort(a,new myComArr());
        
//         for(int x:a){
//             System.out.println(x);
//         }
//     }
    
// }

