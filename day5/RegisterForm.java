package day5;
import java.util.Scanner;
public class RegisterForm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine() ;
        String Email = sc.nextLine();
        if(Name.length() == 8){
            if(Email.length() == 10){
                System.out.println("Registration Successfully!!");
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
         System.out.println("Invalid");
        }
    }
}
