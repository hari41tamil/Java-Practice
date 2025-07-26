package day15;
class Node{
    int data;
    Node next; 
}
class StackOperation{
    Node top;
    void push(int val){
        Node newnode = new Node();
        newnode.data = val;
        newnode.next = top;
        top = newnode;
    }
    void pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        top = top.next;
    }
    void peek(){
        if(top == null){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("My peek value is : "+top.data);
        }
    }
    void display(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Stack {
    public static void main(String[] args) {
        StackOperation s = new StackOperation();
        s.push(10);
        // s.push(20);
        // s.push(30);
        s.display();
        s.pop();
        s.peek();
        s.display();
    }
}
