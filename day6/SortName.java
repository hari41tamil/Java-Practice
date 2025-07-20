import java.util.Arrays;
import java.util.Scanner;

public class SortName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "zyxud";
        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        
    }
}