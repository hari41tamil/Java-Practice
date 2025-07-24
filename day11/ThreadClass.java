package day11;
import java.lang.*;
public class ThreadClass extends Thread {
    public static void main(String[] args) {
        ThreadClass obj = new ThreadClass();
        Thread obj1 = new Thread("Harini");// Thread Name
        obj.start();
        System.out.println("Object Created");
        System.out.println(obj1.getName());
    }
    
}
