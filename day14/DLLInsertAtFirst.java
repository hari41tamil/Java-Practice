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
    void display(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class DLLInsertAtFirst {
    public static void main(String[] args) {
        DLL d = new DLL();
        d.InsertAtFirst(6);
        d.InsertAtFirst(4);
        d.InsertAtFirst(2);
        d.display();
    }
}
