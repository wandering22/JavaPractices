import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode cur=pHead;
        ListNode shead=new ListNode(0);
        ListNode bhead=new ListNode(0);
        ListNode scur=shead;
        ListNode bcur=bhead;

        while(cur != null){
            if(cur.val < x){
                scur.next = new ListNode(cur.val);
                scur = scur.next;
            }else{
                bcur.next = new ListNode(cur.val);
                bcur = bcur.next;
            }
            cur = cur.next;
        }
        cur = shead;
        while(cur.next != null && cur.next.val != 0){
            cur = cur.next;
        }
        cur.next = bhead.next;
        return shead.next;


    }
}