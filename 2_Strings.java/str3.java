public class str3 {
    public static void main(String[] args) {
        System.out.println("\n***********\n");
        
        String str="Sonu Bhardwaj";
        String str1=str.toLowerCase();
        String str2=str.toUpperCase();
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("\n***********\n");
 
        String strr="   Welcome   ";
        String str3=strr.trim();
        System.out.println(strr);
        System.out.println(str3);

        System.out.println("\n***********\n");

        String st="Welcome";
        String str4=st.substring(2);
        String str5=st.substring(1,6);
        System.out.println(st);
        System.out.println(str4);
        System.out.println(str5);

        System.out.println("\n***********\n");
      
        String str6=st.replace("W","R");
        System.out.println(str6);

        System.out.println("\n***********\n");

        String sc="Mr. Sonu Bhardwaj";
        System.out.println(sc.startsWith("Mr."));
        System.out.println(sc.startsWith("mr."));
        System.out.println(sc.startsWith("Mr.",0));
        System.out.println(sc.startsWith("Mr.",2));
        // Toffset= means starting with index 
        System.out.println(sc.endsWith("aj"));
        System.out.println(sc.charAt(3));
        System.out.println(sc.charAt(4));
        System.out.println(sc.indexOf('S'));            
        System.out.println(sc.indexOf('S',5));      //check from left to right
        System.out.println(sc.indexOf('a',5));
        System.out.println(sc.indexOf('a',11));
        System.out.println(sc.indexOf('a',12));
        System.out.println(sc.lastIndexOf('S'));
        System.out.println(sc.lastIndexOf('a',10));    //check from right to left
        System.out.println(sc.lastIndexOf('a',14));
        System.out.println(sc.lastIndexOf('a',16)); 

        System.out.println("\n***********\n");

        String str7="JAVA";
        String str8="java";
        String str9="python";
        String str10="python";
        System.out.println(str9.equals(str10));
        System.out.println(str7.equals(str8));
        System.out.println(str7.equalsIgnoreCase(str8));
        System.out.println(str7.compareTo(str8));
        System.out.println(str8.compareTo(str7));
        System.out.println(str7.compareTo(str9));
        System.out.println(str9.compareTo(str7));
        System.out.println(str9.compareTo(str10));

        System.out.println("\n***********\n");

        String str11="enter the value of a and b";
        System.out.println(str11.contains("value"));
        System.out.println(str11.contains("are"));

        System.out.println("\n***********\n");

        String str12="enter the value ";
        String str13=" of a and b";
        System.out.println(str12.concat(str13));
        System.out.println(str12+str13);
    }
}
