// 1. Variable Arguments (Varargs) in Java allow methods to accept a variable number of arguments, simplifying the creation of methods that need to handle different numbers of parameters. 
//2. also called elepis ,is more powerfulll then passing an array,as it support both array and normal value function .but passing an array does not support the normal value function i.e. show(),show(10,20,...)
// 3. Vriable arguments must be last one.

// package _9avriableArgument.java;

public class _0declerationofAvriableargs {
    static void show(int ...A){                  
    // static void show(int []A){
        for (int x : A) {
            System.out.print(x+" " );
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        show();
        show(10);
        show(20,30);
        show(40,50,60,70,80,90,100);
        show(new int[]{1,2,3,4,5,6,7,8,9});
    }
    
}
