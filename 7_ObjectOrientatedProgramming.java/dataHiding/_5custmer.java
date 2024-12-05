class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class _5custmer {
    public static void main(String[] args) {
        Customer c=new Customer("Apple56427", "Sonu bhardwaj","ABES enginerring college ghaziabad","8059437568");

        System.out.println("Customer id : "+c.getCustId());
        System.out.println("Customer name : "+c.getName());
        System.out.println("Address : "+c.getAddress());
        System.out.println("Phone no. : "+c.getPhno());
    }
}
