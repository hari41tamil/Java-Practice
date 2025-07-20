public class NonStaticClass {
    void display(){
        System.out.println("Good Morning");
    }
}
class classes{
    public static void main(String[] args) {
        NonStaticClass obj = new NonStaticClass();
        obj.display();
    }
}
