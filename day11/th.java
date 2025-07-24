package day11;
import java.lang.*;

public class th extends Thread{
    public static void main(String[] args) {
    Thread t = new Thread();
    t.start();
    System.out.println(Thread.currentThread().getName());
    }
}
