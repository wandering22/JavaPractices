package MyLinked;



//单链表
public class MyLinkedList1 {
    Node head=null;
    Node last=null;
    int size=0;



    public Node pushFront(Node head, int val){
        head=new Node(val,head);
        size++;
        return head;
    }

    public Node popFront(Node head){
        if(head==null){
            throw new RuntimeException("空了！");
        }
        head=head.next;
        size--;
        return head;
    }

    public void pushBack(Node head, int val){
        Node node =new Node(val);
        if(head==null){
            head=null;
        }else{
             last=head;
            while(last.next!=null){
              last  =last.next;
            }
            last.next=node;
            last=last.next;
            size++;
        }
    }

    public void popBack(Node head){
            if(head==null){
                throw new RuntimeException("空了！");
            }else{
                Node prevlast=head;          //prev为倒数第二个结点
                while(prevlast.next.next!=null){
                    prevlast=prevlast.next;
                }
                prevlast.next=null;
                size--;
            }

    }



}
