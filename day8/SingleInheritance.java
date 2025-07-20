class Parent{
    int x=10;
    void parentMethod(){
        System.out.println("Parent Method "+x);
    }
}
class Child extends Parent{
    void ChildMethod(){
        System.out.println("Child Method "+x);
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.ChildMethod();
    }
    
}
