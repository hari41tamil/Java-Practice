package day10;
class class1{
    void Display(int x){
        System.out.println("This is Class 1 "+x);
    }
}
class class2{
    void Display(int y){
        System.out.println("This is Class 2 "+y);
    }
}
class class3{
    void Display(int x){
        System.out.println("This is Class 3 "+x);
    }
}
public class OverRidding {
    public static void main(String[] args) {
        class1 obj1 = new class1();
        class2 obj2 =new class2();
        class3 obj3 = new class3();
        obj1.Display(10);
        obj2.Display(20);
        obj3.Display(30);
    }
}
