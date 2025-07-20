package day9;
class Encapsulation{
    private String name;
    private int age;
    private String setname = "Harini ";
    private int Ages = 21;
    public void setName(){
        //String setname;
        //int Ages;
        name = setname;
        age = Ages;
    }

    public void getName(){
        System.out.println(name+age);

    }
}

public class Encaps {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName();
        //System.out.println(obj.getName());
        obj.getName();
        
    }
    
}
