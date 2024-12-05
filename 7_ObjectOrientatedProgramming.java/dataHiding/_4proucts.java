class Product{
    
    private String itemno;
    private String name;
    private double price;
    private int qty;

    public Product(){
        itemno="ASER12345";
        name="Acer laptop";
        price=56000;
        qty=2;
    }
    public Product(String no,String n,double p,int q){
        itemno=no;
        name=n;
        setPrice(p);
        setQty(q);
    }

    //no need to write set for item no and name as their values or literals cannot be cahnge as once assigned.
    // public void setItemno(int no){
    //      itemno=no;
    // }
    // public void setName(String n){
    //     name=n;
    // }
    public void setPrice(double p){
        price=p;
    }
    public void setQty(int q){
        qty=q;
    }

    public String getItemno(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

}

public class _4proucts {
    public static void main(String[] args) {
        Product p=new Product();
        // Product p=new Product("Apple121345","Apple M1",90000,2);

        System.out.println("Item Num : "+p.getItemno());
        System.out.println("Name of Product : "+p.getName());
        System.out.println("Price : "+p.getPrice());
        System.out.println("Quqntity : "+p.getQty());
    }
}
