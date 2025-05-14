abstract class Voice{
    abstract public void voice();
}

abstract class dog extends Voice{
    // public void voice(){
    //     System.out.println("Bark-Bark");
    // }
    
}

class cat extends Voice{
    public void voice(){
        System.out.println("Mau-Mau");
    }
    
}

public class _3Animal {
    public static void main(String[] args) {
        
        cat c=new cat();
        c.voice();
        
    }
}
