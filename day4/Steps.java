package day4;
import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=1,b=1;
        int c = 0;
        int num = sc.nextInt();
        for(int i=2;i<=num;i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);

    }

}
