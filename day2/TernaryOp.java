package day2;

public class TernaryOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 44;
        System.out.println((a>b && a>c)? "A is Max":(b>a && b>c)?"B is Max":"C is Max");
    }
}
