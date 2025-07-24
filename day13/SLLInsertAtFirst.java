package day13;

class Node{
    int data;
    Node next;
}
class SLL{
    Node Head;
    void InsertAtFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = Head;
        Head = newNode;
    }
    void display(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class SLLInsertAtFirst {
    public static void main(String[] args) {
        SLL s = new SLL();
        s.InsertAtFirst(10);
        s.InsertAtFirst(5);
        s.InsertAtFirst(1);
        s.display();
    }
}
