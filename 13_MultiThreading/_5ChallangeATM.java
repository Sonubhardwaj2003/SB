class ATM{
    synchronized public void checkBalance(String name){
        System.out.println("Customer named - "+name+" checked his balance.");
    }

    synchronized public void widthraw(String name,long amount){
        System.out.println(name+" whidthraw his amount : "+amount);
    }
}

class customer1 extends Thread{
    ATM atm;
    String name;
    long amount;

    public customer1(ATM atm,String name,long amount){
        this.atm=atm;
        this.name=name;
        this.amount=amount;
    }

    public void run(){
        atm.checkBalance(name);
        atm.widthraw(name,amount);
    }
}

public class _5ChallangeATM {
    public static void main(String[] args) {
        ATM atm=new ATM();

        customer1 c1=new customer1(atm,"Sonu bahrdwaj",100000);
        customer1 c2=new customer1(atm,"Harsh singh",5000);

        c1.start();
        c2.start();
    }
}
