package day2;

public class ArithInOrdMethod {
    public void operation(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    public static void main(String[] args) {
        ArithInOrdMethod obj = new ArithInOrdMethod();
        obj.operation(10,20);
    }
}
