class TV{
    public void channe(){
        System.out.println("TV channel");
    }
    public void switchON(){
        System.out.println("TV switc is on");
    }
}
class SmartTV extends TV{
    // @Override
    public void channe(){
        System.out.println("Smart TV channel");
    }
    // @Override
    public void switchON(){
        System.out.println("Smart TV switc is on");
    }
    public void browse(){
        System.out.println("Smart Tv We are browsing");
    }
}

public class _6TvAndSmarttv {
    public static void main(String[] args) {
        TV t=new TV();
        t.channe();
        t.switchON();
        
        SmartTV st=new SmartTV();
        st.channe();
        st.switchON();
        st.browse();

        TV tv=new SmartTV();
        tv.channe();
        tv.switchON();
        // // cannot execute the methode which is not present in the super class , as reference of super class is taken ,callin only those methods which are present in super clss .
        // tv.browse();
    }
}
