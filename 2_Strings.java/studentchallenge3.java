public class studentchallenge3 {
    public static void main(String[] args) {
        
        //remove special character from the string
        String str1="a!b#D%s&d";
        String str2=str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

        //remove extra spaces 
        String str3="    abs abh    hbns   hsna      nHB";
        String str4=str3.replaceAll("\\s+", " ");
        System.out.println(str4.trim());

    }
}
