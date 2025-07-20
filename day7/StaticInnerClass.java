public class StaticInnerClass {
    class InnerClass{
        static void display(){
            System.out.println("Welcome to Java!!");
        }
    }
    public static void main(String[] args) {
        InnerClass.display();
    }
}
