package day14;
class Node{
    int data;
    Node next;
}
class InsertData{
    Node Head;
    Node Tail;
    void insert(int val){
        Node newnode = new Node();
        newnode.data =val;
        if(Head == null){
            Head = Tail = newnode;
            Tail.next = Head;
            return;
        }
        Tail.next = newnode;
        Tail = newnode;
        Tail.next = Head;
    }

    void display(){
        Node temp = Head;
        do { 
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp!=Head);
    }
}
public class CirSLLInsert {
    public static void main(String[] args) {
        InsertData obj = new InsertData();
        obj.insert(10);
        obj.insert(20);
        obj.display();  
    }  
}
