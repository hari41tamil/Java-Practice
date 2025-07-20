
class student{
    int a = 10;
    int b = 20;
    public int add(){
        return a+b;
    }
}



class NormalMethod {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.add());
        
    }
    
}
