class NonStaticInnerClass {
    class InnerClass{
        void display(){
            System.out.println("Hello Guys");
        }
    }
    public static void main(String[] args) {
        NonStaticInnerClass obj = new NonStaticInnerClass();
        NonStaticInnerClass.InnerClass obj1 = obj.new InnerClass();
        obj1.display();
    }
}
