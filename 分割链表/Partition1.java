package 分割链表;

public class Partition1 {
    //分割链表
    public static Node partition(Node head, int x) {
        Node cur = head;
        Node shead = null;
        Node slast = null;
        Node bhead = null;
        Node blast = null;
        while (cur != null) {
            if (cur.val <= x) {
                if (shead == null) {
                    shead = cur;
                } else {
                    slast.next = cur;
                }
                slast = cur;
            } else {
                if (bhead == null) {
                    bhead = cur;
                } else {
                    blast.next = cur;
                }
                blast=cur;
            }
            cur = cur.next;
            if (shead == null) {
                return bhead;
            }
            if (bhead == null) {
                return shead;
            }
        }
        slast.next = bhead;
        blast.next = null;
        return shead;
    }
}
