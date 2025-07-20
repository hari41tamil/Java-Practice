package day2;

public class ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = -4;
        int d = 3;
        int age = 5;
        System.out.println((a%2 == 0)?"A is Even":"B is Odd");
        System.out.println((b%2 == 0)? "B is Even":"B is Odd");
        System.out.println((c>0)?"Negative":"Positive");
        System.out.println((d>0)?"Negative":"Positive");
        System.out.println((age>= 18)?"Eligible for vote":"Not Eligible for Vote");
    }
    
}
