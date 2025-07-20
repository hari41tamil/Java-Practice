
import java.util.Arrays;
import java.util.Scanner;
public class sortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Names:");
        String[]  str = new String[3];
        for(int i =0;i<3;i++){
            str[i] = sc.nextLine();
        } 
        Arrays.sort(str);
        for(String name : str){
            System.out.println(name);
        }

    }
}
