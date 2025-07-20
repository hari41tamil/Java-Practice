package day2;

public class SwapWithout3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.err.println(b);
        a = a + b; //15
        b = a - b; //10
        a = a - b;
        System.out.println(a);
        System.err.println(b);

    }
}
