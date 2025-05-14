// package 16_lambdaExpession;

// Lambda Expression are used to defining the Anonymeous methods or we can say nameless method .it reduce the code length

// // 1.simple interface (without any lambda expression)
// @FunctionalInterface
// interface myLembda{
//     public void display();
// }

// class my implements myLembda{
//     @Override
//     public void display(){
//         System.out.println("Hello java!");
//     }
// }

// public class _1basicLambdaExp {
//     public static void main(String[] args) {
//         my m=new my();
//         m.display();
//     }
// }



// 2.with lambda expession 
@FunctionalInterface
interface myLembda{
    public void display();
}

public class _1basicLambdaExp {
    public static void main(String[] args) {
        // myLembda m=new myLembda(){
        //     public void display(){
        //         System.out.println("hello java");
        //     }
        // };
        // m.display();


        myLembda m= ()->
            {
                System.out.println("hello java");
            };
        m.display();
    }
}
