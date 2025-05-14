// package 8_Inheritence;
class Account{

    public String Accnum;
    public String name;
    public String dob;
    public String address;
    public String phone;
    public String email;
    public double balance;

    // public Account(String Accnum, String name, String dob, String address, String phone, String email, double balance){
    // this.Accnum=Accnum;
    // this.name=name;
    // this.dob=dob;
    // this.setAddress(address);
    // this.setphone(phone);
    // this.setemail(email);
    // this.setbalance(balance);
    // }

    public String getAccnum(){
        return Accnum;
    }
    public String getname(){
        return name;
    }
    public String getdob(){
        return dob ;
    }
    public String getaddress(){
        return address;
    }
    public String getphone(){
        return phone;
    }
    public String getemail(){
        return email;
    }
    public double getbalance(){
        return balance;
    }

    public void setAddress(String add){
        address=add;
    }
    public void setphone(String num){
        phone=num;
    }
    public void setemail(String mail){
        email=mail;
    }
    public void setbalance(double bal){
        balance=bal;
    }
}

class Savingacc extends Account{
    public double deposite;
    public double widthraw;
    public double fixedamount;

    // public Savingacc(double d,double w,double fa){
    //     this.deposite=d;
    //     this.widthraw=w;
    //     this.fixedamount=fa;
    // }

    public double deposite(){
        return deposite+balance;
    }
    public double widthraw(){
        return widthraw;
    }
    public double newbalance(){
        return deposite()-widthraw();
    }
    public double fixedamount(){
        return fixedamount;
    }    
}

public class _2AccountLoanSaving {
    public static void main(String[] args) {
        // Account ac=new Account("uco127864836899", "Sonu", "30/07/2003", "129 basana Rohtak haryana 124022", "8059437568", "sb94320242gmail.com", 50000.00);
        Account ac=new Account();
        
        ac.Accnum="uco83648y4y989";
        ac.name="Sonu";
        ac.dob="30/07/2003";
        ac.address="129 basana Rohtak haryana 124022";
        ac.email="sb94320242gmail.com";
        ac.phone="8059437568";
        ac.balance=5000.00;

        System.out.println("Account details : ");
        System.out.println("Account no : "+ac.getAccnum());
        System.out.println("Account holder name : "+ac.getname());
        System.out.println("Date of birth : "+ac.getdob());
        System.out.println("Address : "+ac.getaddress());
        System.out.println("Phone number : "+ac.getphone());
        System.out.println("Gemail : "+ac.getemail());
        System.out.println("Account balance : "+ac.getbalance());
        System.out.println(" ");


        // Savingacc sa=new Savingacc(846865,634648364,783482668);
        Savingacc sa=new Savingacc();
        sa.deposite=8624887;
        sa.widthraw=663343;
        sa.fixedamount=50000;

        System.out.println("Saving account details : ");
        System.out.println("Account no : "+ac.getAccnum());
        System.out.println("Account holder name : "+ac.getname());
        System.out.println("Date of birth : "+ac.getdob());
        System.out.println("Address : "+ac.getaddress());
        System.out.println("Phone number : "+ac.getphone());
        System.out.println("Gemail : "+ac.getemail());
        System.out.println("Account balance : "+ac.getbalance());
        System.out.println("Deposite : "+sa.deposite());
        System.out.println("Widthraw : "+sa.widthraw());
        System.out.println("New balance : "+sa.newbalance());
        System.out.println("Fixed amount : "+sa.fixedamount());

    }
}
