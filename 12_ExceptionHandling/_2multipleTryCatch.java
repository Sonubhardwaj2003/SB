public class _2multipleTryCatch {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,0};

        // Multiple try-catch.

        // // no error ,don't follow catch block
        // try{
        //     int c=a[2]/a[0];
        //     System.out.println("division is : "+c);
            
        //     System.out.println(a[4]);
        // }

        // // 1st statement give error dont follow the nexy statement.and excute only one catch block.
        // try{
        //     int d=a[2]/a[6];
        //     System.out.println("division is : "+d);

        //     System.out.println(a[4]);
        // }

        // 2st statement give error ,but 1st is executed first .and excute only one catch block with index out of bond .
        try{
            int c=a[2]/a[0];
            System.out.println("division is : "+c);

            System.out.println(a[9]);
        }
        catch (ArithmeticException e) {
            System.out.println("not divion by zero : "+e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound : "+e);
        }

        System.out.println("End of program");
    }
}
