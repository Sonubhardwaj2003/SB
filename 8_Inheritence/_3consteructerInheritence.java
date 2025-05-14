// constructer in Inheritance
class Parent{
    public Parent(){
        System.out.println("parent constructer");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("child constructer");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("Grandchild constructer");
    }
}

public class _3consteructerInheritence {
    public static void main(String[] args) {
        // call only parent class
        // @SuppressWarnings("resources")
        // Parent p=new Parent();                   
        // System.out.println("---------");
        // // call parent class first ,then child class
        // Child c=new Child();
        // System.out.println("---------");
        // // call parent class then child class and the grandchild class
        // GrandChild g=new GrandChild();
    }
}






// // Parameterise and non-parameterise costructer
// class Parent{
//     public Parent(){
//         System.out.println("parent non- parm constructer");
//     }
//     public Parent(int x){
//         System.out.println("Parent parm constructer "+x);
//     }
// }

// class Child extends Parent{
//     public Child(){
//         System.out.println("child non-parm constructer");
//     }
//     public Child(int y){
//         System.out.println("child parm constructer "+y);
//     }
//     // public Child(int x,int y){
//     //     System.out.println("child 2-parm constructer "+x+" "+y);
//     // }
//     public Child(int x,int y){
//         super(x);
//         System.out.println("child 2-parm constructer "+x+" "+y);
//     }
// }

// public class _3consteructerInheritence {
//     public static void main(String[] args) {
//         // // call only parent class
//         // Parent np=new Parent();  
//         // System.out.println("---------");           
//         // Parent p=new Parent(20);                   
//         // System.out.println("---------");
//         // // call parent class first ,then child class
//         // Child nc=new Child();
//         // System.out.println("---------");
//         // Child c=new Child(50);
//         // System.out.println("---------");
//         // Child tc=new Child(30,10);
        
//     }
// }
