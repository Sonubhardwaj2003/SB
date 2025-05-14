// Local inner class, a inner class inside the method of outer class

class outer{

    public void display(){

        class inner{
            public void innerDisplay(){
                System.out.println("Hellow");
            }
        }

        inner i=new inner();
        i.innerDisplay();
        // new inner().innerDisplay();

    }
}

public class _2localinner {
    public static void main(String[] args) {
        
        outer oi=new outer();
        oi.display();
    
    }
}
