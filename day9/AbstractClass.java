package day9;

import AbsClass;

abstract class AbsClass{
    abstract void abs1();
}
public class AbstractClass {
    public static void main(String[] args) {
        AbsClass obj = new AbsClass() {
            void abs1(){
                System.out.println("I'm hiding the details");
            }
        };
        obj.abs1();
    }
    
}
