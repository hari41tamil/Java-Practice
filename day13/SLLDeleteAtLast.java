import Node;
import SLL;

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
    void InsertAtLast(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        Node temp = Head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void lastDelete(){
        Node temp = Head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    void display(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class SLLDeleteAtLast  {
    public static void main(String[] args) {
        SLL s = new SLL();
        s.InsertAtFirst(10);
        s.InsertAtFirst(5);
        s.InsertAtFirst(1);
        s.InsertAtLast(2);
        s.lastDelete();
        s.display();
    }   
}

