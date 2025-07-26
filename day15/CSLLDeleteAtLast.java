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
    void DeleteAtFirst(){
        if(Head == null){
            System.out.println("List is Empty");
        }
        else if(Head == Tail){
            Head = Tail = null;
        }
        else{
            Head = Head.next;
            Tail.next = Head;
        }
    }
    void DeleteAtLast(){
        if(Head == null){
            System.out.println("List is Empty");
        }
        else if(Head == Tail){
            Head = Tail = null;
        }
        else{
            Node temp = Head;
            while(temp.next != Tail){
                temp = temp.next;
            }
            temp.next=Head;
            Tail=temp;
        }
    }
    void display(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class CSLLDeleteAtLast  {
    public static void main(String[] args) {
        CSLL s = new CSLL();
        s.InsertAtFirst(10);
        s.InsertAtFirst(5);
        s.InsertAtFirst(1);
        s.InsertAtLast(2);
        s.InsertAtLast(6);
        s.DeleteAtFirst();
        s.DeleteAtLast();
        s.display();
    }   
}

