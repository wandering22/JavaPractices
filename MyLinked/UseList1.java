package MyLinked;

import MyLinked.MyLinkedList1;


public class UseList1 {
    public static void print(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }

    public static void main(String[] args) {
        Node head=null;
        MyLinkedList1 h=new MyLinkedList1();
        head=h.pushFront(head,5);
        head=h.pushFront(head,4);
        head=h.pushFront(head,3);
        head=h.pushFront(head,2);
        head=h.pushFront(head,1);
        print(head);

        head=h.popFront(head);
        head=h.popFront(head);
        head=h.popFront(head);
        head=h.popFront(head);
        print(head);


        h.pushBack(head,4);
        h.pushBack(head,3);
        print(head);
        h.popBack(head);
        h.popBack(head);
        print(head);
    }
}
