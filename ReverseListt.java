
 class ListNode {
     int val;
     ListNode next = null;

     ListNode(int val) {
         this.val = val;
     }
 }
public class ReverseListt {
    public ListNode ReverseList(ListNode head) {
        ListNode nhead=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=nhead;
            nhead=cur;

            cur=next;
        }
        return nhead;
    }
}