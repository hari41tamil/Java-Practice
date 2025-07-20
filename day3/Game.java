package day3;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Strenth Level:");
        int Strenth = sc.nextInt();
        //Gate1
        if(Strenth >= 70){
            System.out.println("You are Eligible to play the Game Right now!!!");
        }
        //Gate 2
        System.out.println("How many  Magic Stick you have?");
        int Stick = sc.nextInt();
        if(Stick > 0){
            System.out.println("The Magic Stick is Gives to God");
        }
        else{
            System.out.println("You are not Eligible to play");
        }
        //Gate 3
        System.out.println("Enter the colurs:\n1.Red-1\n2.Blue-2\n3.Green-3");
        int Gate = sc.nextInt();
        if(Gate == 1){
            System.out.println("Your Choice is Red and you are eligible to play and it is Danguous!");
        }
        else if(Gate == 2){
            System.out.println("Your choice is Blue and you are not eligible to play");
        }
        else if(Gate == 3){
            System.out.println("you are Eligible to Play!!!");
        }
        else{
            System.out.println("Invalid Option");
        }
        //Gate 4
        System.out.println("Are you have a Sword?");
        System.out.println("Are you have a Shield?");
        boolean Sword = sc.nextBoolean();
        boolean Shield = sc.nextBoolean();
        if(sword == true){
            if(shield == true){
            System.out.println("You are Eligible to continue the Game!!");
       }
    }
}
