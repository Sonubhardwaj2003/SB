interface member{
    void callback();
}

class custmor implements member{
    String name;
    
    public custmor(String n){
        this.name=n;
    }
    public void callback(){
        System.out.println("Ok ,i will visit the store  and i am "+ name);
    }
}

class store{
    member mem[]=new member[100];
    int count=0;

    public void register(member m){
        mem[count++]=m;
    }

    public void visite(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}

public class _2callback {
    public static void main(String[] args) {
        store s=new store();

        custmor c1=new custmor("Sonu");
        custmor c2=new custmor("Harsh");

        s.register(c1);
        s.register(c2);

        s.visite();
    }
}
