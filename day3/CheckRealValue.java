package day3;

import java.util.Scanner;

public class CheckRealValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double res = b*b-4.0*a*c;
        if(res>0){
            System.out.println((-b+Math.pow(res,0.5))/(2*a));
            System.out.println((-b-Math.pow(res,0.5))/(2*a));  
        }
        else{
            System.out.println("No real Root");
        }
    }
}
