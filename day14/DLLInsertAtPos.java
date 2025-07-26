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
    void InsertAtLast(int val){
        if(Head == null){
            InsertAtFirst(val);
            return;
        }
        Node newNode = new Node();
        newNode.next = null;
        newNode.data = val;
        Node temp = Head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    void InsertAtPos(int pos,int val){
        if(pos == 1){
            InsertAtFirst(val);
            return;
        }
        Node temp = Head;
        Node newNode = new Node();
        newNode.data = val;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    void display(){
        Node temp = Head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class DLLInsertAtPos {
    public static void main(String[] args) {
        DLL d = new DLL();
        d.InsertAtFirst(6);
        d.InsertAtFirst(4);
        d.InsertAtFirst(2);
        d.InsertAtLast(8);
        d.InsertAtPos(2, 3);
        d.display();
    }
}
