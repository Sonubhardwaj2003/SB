// Exceptions ,are the errors in code .they are "Run time error",which are manage by using the exception handling .
//Exception in Java is an error condition that occurs when something wrong happens during the program execution.

//An Exception is an unwanted or unexpected event that occurs during the execution of a program (i.e., at runtime) and disrupts the normal flow of the program’s instructions. It occurs when something unexpected things happen, like accessing an invalid index, dividing by zero, or trying to open a file that does not exist.

// Exception handling in Java allows developers to manage runtime errors effectively by using mechanisms like try-catch block, finally block, throwing Exceptions, Custom Exception handling etc.                                     
// The main aim of using the exception handling is to "prevent the code from crashing and maintain continuity".

// Sysntex error -- compiler (correect)
// logical error -- debegur ,tracing
// Runtime error -- Exception HAndling.

// try{}-catch(){}......the code with error (or no error also) is written in try block .And without error is written in catch block . Catch block is excuted only when there is an error in the try block ,else it doesnot excuted.In catch block we are written a exception with "Arithematic Exception e" for arthematic errors . as so on for different errors .        for one try block there can be multiple catch block.the number of catch block must be equal to the no of set of statements.

// try{}-catch(){}-finally{}...A try block can have a finnaly block without catch block .As try{}-catch(){}..,try{}-finally{} .., try{}-catch(){}-finally{}. A catch block may or may not excuted depends on the try block as it contains error or not ,, but a Finaly block must excuted,either it has error or not. it is used to clean-up.

// Example how to use .
import java.util.Scanner;
public class _1general {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner read=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=read.nextInt();
        int b=read.nextInt();
        int c;

        try {
            c=a/b;
            System.out.println("division is : "+c);
        } 
        // it excute only when try block have error(/ by 0)
        catch (Exception e) {
            System.out.println("Denominator canot be zero ,"+e);
        }
        
        System.out.println("End of program,Exit");

    }
}