public class _3sortString {
    public static void main(String[] args) {
        
        String arr[]={"ram","shyam","python","java","English","evs"};

        java.util.Arrays.sort(arr);

        for (String x : arr) {
            System.out.print(x+" <--");
        }
        System.out.println(" ");
    }
}
