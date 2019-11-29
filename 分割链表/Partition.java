package 分割链表;

public class Partition {
    //分割链表
    public static Node partition(Node head, int x){
        Node cur=head;
        Node shead=null;
        Node slast=null;
        Node bhead=null;
        Node blast=null;
        while(cur!=null){
            if(cur.val<x){
                if(shead==null){
                    shead=cur;
                }else{
                    slast.next=cur;
                }
                slast=cur;
            }
            else{
                if(bhead==null){
                    bhead=cur;
                }else{
                    blast.next=cur;
                }
                blast=cur;
            }
            cur=cur.next;
        }

        if(shead==null){
            return bhead;
        }
        if(bhead==null){
            return shead;
        }
        slast.next=bhead;
        blast.next=null;
        return shead;
    }
public static Node build(){
    Node n1=new Node(2);
    Node n2=new Node(6);
    Node n3=new Node(7);
    Node n4=new Node(4);
    Node n5=new Node(8);
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
    return n1;
}
    public static void print(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.val);
            cur=cur.next;
        }
    }
    public static void main(String[] args) {
        Node head=build();
        head=partition(head,3);
        print(head);
    }
}
