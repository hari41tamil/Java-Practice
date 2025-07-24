package day11;
import java.lang.*;
class RunImp implements Runnable{
    public void run(){
        System.out.println("I'm Runnable Interface");
    }
}
public class RunImple{
    public static void main(String[] args) {
        RunImp obj = new RunImp();
        obj.run();

    }
}
