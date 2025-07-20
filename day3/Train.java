package day3;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Seat Number: ");
        int Num = sc.nextInt();
        int check = Num%8;
        switch (check) {
            case 0:
            System.out.println("Side Upper berth");
            break;
            case 1:
            System.out.println("Lower berth");
            break;
            case 2:
            System.out.println("Middle berth");
            break;
            case 3:
            System.out.println("Upper berth");
            break;
            case 4:
            System.out.println("Upper berth");
            break;
            case 5:
            System.out.println("Middle berth");
            break;
            case 6:
            System.out.println("Lower berth");
            break;
            case 7:
            System.out.println("Side lower berth");
            break;
            default:
            System.out.println("Invalid");
        }
    }
}