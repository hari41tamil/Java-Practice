package day3;

import java.util.Scanner;

public class ChargeStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Charger Percent: ");
        int Charger = sc.nextInt();
        if(Charger >= 90){
            System.out.println("Now use Your Mobile!!!");
        }
        else if(Charger >= 80){
            System.out.println("After some time please connect your Charger!!");
        }
        else if(Charger >= 50){
            System.out.println("Don't Forget to put Charger");
        }
        else{
            System.out.println("Must Connect your Charger Now!");
        }
        
    }
}
