package day5;

class demo{
    int id = 101;
    String name = "Priya";
    public String toString(){
        return id+ " " +name;
    }
}
public class ToString {
    public static void main(String[] args) {
        demo obj = new demo();
        System.out.println(obj);
    }
}
