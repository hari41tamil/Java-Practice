
package day3;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anyone Number: ");
        int Value = sc.nextInt();
        int check = Value%2;
        switch (check) {
            case 0:
            System.out.println("It is Even");
            break;
            case 1:
            System.out.println("It is Odd");
            break;
            default:
            System.out.println("Invalid");
        }
    }
}




// Another option 
//package day3;
//import java.util.Scanner;

//public class Switch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter anyone Number: ");
//        int Value = sc.nextInt();
//        int check = Value%2;
//      switch (check) {
//          case 0 -> System.out.println("It is Even");
//          case 1 -> System.out.println("It is Odd");
//          default ->System.out.println("Invalid");
//        }
//  }
//}