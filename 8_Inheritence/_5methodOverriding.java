// Method overiding is , redefining the same method of super class again in sub class 
// Dyanmic Dispatch metho,when a super class reference holding the object of sub class on a overrided method

class Super{
    public void display(){
        System.out.println("hello!!");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("Welcome!!");
    }
}

public class _5methodOverriding {
    public static void main(String[] args) {
        // metod overriding
        Super s=new Super();
        Sub sc=new Sub();

        s.display();
        sc.display();


        // Dyanmic disptch method 
        Super su=new Sub();

        su.display();
    }
}
