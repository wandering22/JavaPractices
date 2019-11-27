public class CopyRlinked {
    public static RNode copy(RNode head){
        if(head==null){
            return null;
        }
        RNode cur;
        cur=head;
        while(cur!=null){
            RNode node=new RNode();
            node.val=cur.val;
            node.next=cur.next;
            cur.next=node;
            cur=node.next;
        }
        cur=head;
        while(cur!=null) {
            if (cur.next != null) {
                cur.next.random = cur.random.next;
            }
            cur=cur.next.next;
        }

        cur=head;
        RNode nhead=cur.next;
        while(cur!=null){
            RNode node=cur.next;
            cur.next=node.next;
            if(node.next!=null){
                node.next=cur.next.next;
            }
            cur=cur.next;
        }
        return nhead;
    }
}
