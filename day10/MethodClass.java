class dog{
     void show(int x){
        System.out.println ("Bow Bow"+x);
    }
}
class cat{
     void show(int x){
        System.out.println ("meow meow"+x);
    }
}
public class MethodClass {
    public static void main(String[] args) {
        dog obj1 = new dog();
        cat obj2 = new cat();
        obj1.show(10);
        obj2.show(20);
    }
}