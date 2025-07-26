import DLL;
import Node;

package day14;
class Node{
    int data;
    Node next;
    Node prev;
}
class DLL{
    Node Head;
    void InsertAtFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.prev = null;
        if(Head != null){
            Head.prev  = newNode;
        }
        newNode.next = Head;
        Head = newNode;
    }
    void DeleteAtFirst(){
        Head = Head.next;
        Head.prev=null;
    }
    void DeleteAtPos(int pos){
        if(pos == 1){
            DeleteAtFirst();
            return;
        }
        Node temp = Head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    void display(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class DLLDeleteAtPos {
    public static void main(String[] args) {
        DLL d = new DLL();
        d.InsertAtFirst(6);
        d.InsertAtFirst(4);
        d.InsertAtFirst(2);
        d.DeleteAtPos(2);
        d.display();
    }
}
