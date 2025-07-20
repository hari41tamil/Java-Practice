package day2;
import java.util.Scanner;

public class validCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your CGPA:");
        float CGPA = 7.5f;
        float data = sc.nextFloat();
        if(CGPA <= data){
            System.out.println("You are Eligible");          
        }
        else{
            System.out.println("Your are not Eligible");
        }
    }
}