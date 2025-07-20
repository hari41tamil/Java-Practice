package day2;
import java.util.Scanner;
public class Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your CGPA:");
        float CGPA = 7.5f;
        float data = sc.nextFloat();
        System.out.println("Enter your No.of Arrears:");
        int Arrears = sc.nextInt();
        if(CGPA < data && Arrears == 0){
            System.out.println("You are Eligible for MNC");          
        }
        else if(data > 7.0 &&  Arrears == 1){
            System.out.println("You are Eligible");
        }
        else if((data >= 6.5 && data <=7.0) && Arrears == 0 || Arrears == 1){
            System.out.println("You are Eligible");
        }
        else{
            System.out.println("Your are not Eligible");
        }
    }
}