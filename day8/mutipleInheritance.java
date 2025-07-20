package day8;
//Multiple Inheritance Using Interface
interface  Parent1{
     void parent1Method();
}
interface Parent2{
    void parent2Method();
}
class Child implements  Parent1,Parent2{
    public void parent1Method(){
        System.out.println("Parent1 is Here!!");
    }
    public void parent2Method(){
        System.out.println("Parent2 is Here!!");
    }
}

public class mutipleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.parent1Method();
        obj.parent2Method();
    }
    
}




//Multiple Inheritance Using Abstract Class
// abstract  Parent1{
//      abstract void parent1Method();
// }
// abstract class Parent2{
//     abstract void parent2Method();
// }
// class Child extends Parent1,Parent2{
//     public void parent1Method(){
//         System.out.println("Parent1 is Here!!");
//     }
//     public void parent2Method(){
//         System.out.println("Parent2 is Here!!");
//     }
// }

// public class mutipleInheritance {
//     public static void main(String[] args) {
//         Child obj = new Child();
//     }
    
// }
