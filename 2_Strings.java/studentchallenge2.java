public class studentchallenge2 {
    public static void main(String[] args) {

        // if a number is binary or not using string expression function
        int b=101010101;
        String str1=String.valueOf(b);
        // String str1=b+"";
        System.out.println(str1.matches("[01]+"));

        //find a number is hexadecimal or not
        String str2="AD14";
        System.out.println(str2.matches("[A-F0-9]+"));

        //Find that it is in date formate or not
        String str3="30/07/2003";
        System.out.println(str3.matches("[0-3][0-9]/[0|1][0-9]/[0-9]{4}"));
    }
}
