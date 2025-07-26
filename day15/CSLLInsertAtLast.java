package day15;
class Node{
    int data;
    Node next;
}
class CSLL{
    Node Head;
    Node Tail;
    void InsertAtFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(Head == null){
            Head = Tail = newNode;
            newNode.next = Head;
        }
        newNode.next = Head;
        Head = newNode;
        Tail.next = newNode;
    }
    void InsertAtLast(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(Head == null){
            Head = Tail = newNode;
            newNode.next = Head;
        }
        else{
            Tail.next = newNode;
            newNode.next = Head;
            Tail = newNode;
        }
    }
    void display(){
        Node temp = Head;
        if(Head == null){
            return;
        }
        do { 
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != Head);
    }
}
public class CSLLInsertAtLast {
    public static void main(String[] args) {
        CSLL s = new CSLL();
        s.InsertAtFirst(10);
        s.InsertAtFirst(5);
        s.InsertAtFirst(1);
        s.InsertAtLast(2);
        s.display();
    }   
}
