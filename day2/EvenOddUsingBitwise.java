package day2;
public class EvenOddUsingBitwise {
    public static void main(String[] args) {
        int a=10;
        System.out.println(((a&1)==0)?"Even":"Odd");
    }
}
