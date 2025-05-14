public class _3nestedTryCatch {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,0};

        // cases are same as the previous for multiple try catch.

        // Nested Try-Catch.
        try{
            int c=a[2]/a[0];
            // int c=a[2]/a[6];
            System.out.println("1.division is : "+c);
            try{
                System.out.println("2. "+a[9]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("2.index out of bound : "+e);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("1.not divion by zero : "+e);
        }

        System.out.println("***End of program***");
    }
}
