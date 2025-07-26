package day15;
class Node{
    int data;
    Node next; 
}
class QueueOperation{
    Node front;
    Node rear;
    void Enqueue(int val){
        Node newnode = new Node();
        newnode.data = val;
        if(rear == null){
            front = rear = newnode;
            newnode.next = null;
            return;
        }
        newnode.next=null;
        rear.next=newnode;
        rear = newnode;
    }
    void Dequeue(){
        if(front == null){
            System.out.println("Queue Underflow");
            return;
        }
        front = front.next;
    }
    void peek(){
        if(front == null){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("My peek value is : "+front.data);
        }
    }
    void display(){
        Node temp = front;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Queue {
    public static void main(String[] args) {
    QueueOperation q = new QueueOperation();
    q.Enqueue(10);
    q.Enqueue(20);
    q.Enqueue(30);
    q.display();
    q.Dequeue();
    q.peek();
    }
}
