// import java.util.Scanner;

// public class GPSeries {
//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc=new Scanner(System.in); 

//         System.out.println("Enter the first term of series :");
//         int a=sc.nextInt();
//         System.out.println("Enter the number of terms of series :");
//         int n=sc.nextInt();
//         System.out.println("Enter the difference of series :");
//         int r=sc.nextInt(),i;
//         double Series;
       
//         for(i=0;i<n;i++)
//         {
//             Series=a*Math.pow(r,i);
//             System.out.print(Series+",");
//         }
//     }
// }




import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter the first term of series :");
        int a=sc.nextInt();
        System.out.println("Enter the number of terms of series :");
        int n=sc.nextInt();
        System.out.println("Enter the difference of series :");
        int r=sc.nextInt(),i;
        int Series=a;
       
        for(i=0;i<n;i++)
        {
            System.out.print(Series+",");
            Series=Series*r;
        }
    }
}
