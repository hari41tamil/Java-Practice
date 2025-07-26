package day15;
class Stack{
    int top = -1;
    int[] arr = new int[5];
    void push(int val){
        if(top == 4){
            System.out.println("Stack Overflow");
        }
        else{
            arr[++top] = val;
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("My peek value is : "+arr[top]);
    }
    void display(){
        for(int i=0;i<=4;i++){
            System.out.println(arr[i]);
        }
    }
}
public class StackInArray {
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.display();
    }
}
