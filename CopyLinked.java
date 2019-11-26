public class CopyLinked {        //简单链表的复制
    public static Node copy(Node head){
        Node cur=head;
        Node nhead=null;
        Node nlast=null;
        //r(int i=0;i<
        while(cur!=null){

            Node node=new Node(cur.val);
            if(nhead==null){
                nhead=cur;

            }else{
                nlast.next=cur;
            }
            nlast=cur;

            cur=cur.next;
        }
        return nhead;
    }
}
