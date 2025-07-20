package day3;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mark: ");
        int mark = sc.nextInt();
        if(mark >= 70){
            if(mark>= 90){
                System.out.println("o");
            }
            else if(mark >= 80){
                System.out.println("A");
            }
            else{
                System.out.println("B");
             }
        }
        else if(mark >= 50){
            if(mark >= 60){
                System.out.println("C");
            }
            else{
                System.out.println("D");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
