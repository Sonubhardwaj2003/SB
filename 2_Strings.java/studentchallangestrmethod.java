public class studentchallangestrmethod {
    public static void main(String[] args) {

        //find username and domain from gmail
        String str="programmer@gmail.com";

        int i=str.indexOf('@');
        String str1=str.substring(0, i);
        String str2=str.substring(i+1, str.length());

        // System.out.println(str1+" "+str2);
        System.out.println("username: "+str1);
        System.out.println("Domain: "+str2);
        System.out.println(str2.startsWith("gmail"));
        
    }
}
