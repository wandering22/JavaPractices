public class MergeTwoList {
    //连接链表
    public static Node merge(Node list1,Node list2){
        Node cur1=list1;
        Node cur2=list2;
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        Node nhead=null;
        Node nlast=null;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<=cur2.val){
                if(nhead==null){
                    nhead=cur1;
                }else{
                    nlast.next=cur1;
                }
                nlast=cur1;
                cur1=cur1.next;
            } else{
                if(nhead==null){
                    nhead=cur2;
                }else{
                    nlast.next=cur2;
                }
                nlast=cur2;
                cur2=cur2.next;
            }

        }
        if(cur1!=null){
            nlast.next=cur1;
        }
        else{
            nlast.next=cur2;
        }
        return nhead;
    }

    public static Node buildList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
    public static Node buildList2(){
        Node n1=new Node(2);
        Node n2=new Node(6);
        Node n3=new Node (7);
        n1.next=n2;
        n2.next=n3;
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
        Node list1=buildList();
        Node list2=buildList2();
        Node head=merge(list1,list2);
        print(head);

    }
}
