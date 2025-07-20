package day3;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=0,b=1;
        int num = sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.print(a);
            int c = a+b;
            a=b;
            b=c;
        }

    }

}
