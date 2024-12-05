import java.util.Scanner;

public class _2marixmultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        // array A insertion
        int m, n;
        System.out.println("Enter the no.of rows of array A:");
        m = sc.nextInt();
        System.out.println("Enter the no.of columns of array A:");
        n = sc.nextInt();
        int A[][] = new int[m][n];
        System.out.println("enter the Array A elements:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array A elements are :");
        for (int x[] : A) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }

        // Array B insertion
        int r, s;
        System.out.println("Enter the no. of rows of array B:");
        r = sc.nextInt();
        System.out.println("Enter the no. of columns of array B:");
        s = sc.nextInt();
        int B[][] = new int[r][s];
        System.out.println("enter the Array B elements:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < s; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array B elements are :");
        for (int x[] : B) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }

        int C[][] = new int[m][s];
        int k;
        if (n == r) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < s; j++) {
                    C[i][j] = 0;
                    for (k = 0; k < n; k++) {
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("Resultent Array is :");

            for (i = 0; i < m; i++) {
                for (j = 0; j < s; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Multiplication not possible");
        }
    }
}
