package day3;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anyone Number of 0 or 1: ");
        int Value = sc.nextInt();
        int Value1 = sc.nextInt();
        int check = Value1%2;
        switch (Value) {
            case 0:
            switch (check){
            case 0:
            System.out.println("It is Even");
            break;
            default:
            System.out.println("Invalid");
            }
        System.out.println("It is 0");
        break;
        }
        case 1:
        System.out.println("It is Odd");
        break;
        default:
        System.out.println("It is Invalid");
    }
}