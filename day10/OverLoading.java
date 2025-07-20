package day10;
class oneclass{
    void Display(int a, int b){
        System.out.println(a+b);
    }
    void Display(String Name){
        System.out.println(Name);
    }
    void Display(double a,double b){
        System.out.println(a+b);
    }
}



public class OverLoading {
    public static void main(String[] args) {
        oneclass obj  = new oneclass();
        obj.Display(10,4);
        obj.Display("Harini");
        obj.Display(10.2, 20.8);
    }
    
}
