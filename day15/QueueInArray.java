package day15;
class Queue{
    int rear = -1;
    int front = 0;
    int[] arr = new int[5];
    void Enqueue(int val){
        if(rear == 4){
            System.out.println("Queue Overflow");
        }
        else{
            arr[++rear] = val;
        }
    }
    void Dequeue(){
        if(front>rear){
            System.out.println("Queue Underflow");
            return;
        }
        front++;
    }
    void peek(){
        if(front>rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("My peek value is : "+arr[front]);
    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
public class QueueInArray {
    public static void main(String[] args) {
        Queue obj = new Queue();
        obj.Enqueue(10);
        obj.Enqueue(20);
        obj.Enqueue(30);
        obj.Enqueue(40);
        obj.display();
    }
}
