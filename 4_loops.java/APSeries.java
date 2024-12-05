import java.util.Scanner;

public class APSeries {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in); 

        System.out.println("Enter the first term of series :");
        int a=sc.nextInt();
        System.out.println("Enter the nth term of series :");   ///if nth term is given then ..use this 
        int n=sc.nextInt();
        System.out.println("Enter the difference of series :");
        int d=sc.nextInt();
        int Series;
        if((n-a)%d==0){
            for(int i=0;i<=n/d;i++)
            {
                Series=i*d+a;
                System.out.print(Series+",");
            }
        }
        else
        {
            System.out.println(n+" not lies in the series,Series not possible");
        }
    }
}




// import java.util.Scanner;

// public class APSeries {
//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner sc=new Scanner(System.in); 

//         System.out.println("Enter the number of term of series  to be print :");
//         int n=sc.nextInt();
//         System.out.println("Enter the first term of series :");
//         int a=sc.nextInt();
//         System.out.println("Enter the difference of series :");
//         int d=sc.nextInt();
//         int Series;
    
//         for(int i=0;i<n;i++)
//         {
//             Series=i*d+a;
//             System.out.print(Series+",");
//         }
//     }
// }
