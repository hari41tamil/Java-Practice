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
    void InsertPos(int val,int pos){
        Node newNode = new Node();
        newNode.data = val;
        if(pos == 1){
            InsertAtFirst(val);
            return;
        }
        Node temp = Head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
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
public class SLLInsertAtPos {
    public static void main(String[] args) {
        SLL s = new SLL();
        s.InsertAtFirst(10);
        s.InsertAtFirst(5);
        s.InsertAtFirst(1);
        s.InsertPos(2, 3);
        s.display();
    }
}
