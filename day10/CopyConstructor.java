package day10;
class Student{
    String gName;
    int gage;
    Student(String name, int age){
        gName = name;
        gage = age;
    }
    Student(Student S){
        this.gName = S.gName;
        this.gage = S.gage;
    }
    void Display(){
        System.out.println("Name : " +gName + "Age : " +gage);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Harini ",21);
        Student s2 = new Student(s1);
        s1.Display();
    }
}
