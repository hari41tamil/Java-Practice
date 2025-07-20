class StaticClass {
    static int x = 10;
    static void display(){
        System.out.println("Good Morning");
    }
}
class classes{
    public static void main(String[] args) {
        StaticClass.display();
    }
}
