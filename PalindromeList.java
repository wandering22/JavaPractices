public class PalindromeList {
    //链表的回纹结构
    public Node getMiddle(Node head) {
        Node cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        int steps = size / 2;
        Node result = head;
        for (int i = 0; i < steps; i++) {
            result = result.next;
        }
        return result;

    }

    public static Node reverseList(Node head) {
        Node cur = head;
        Node nhead = null;
        while (cur != null) {
            Node next = cur.next;
            cur.next = nhead;
            nhead = cur;
            cur = next;
        }
        return nhead;
    }

    public boolean chkPalindrome(Node A) {
        Node middle = getMiddle(A);
        Node rhead = reverseList(middle);
        Node c1 = A;
        Node c2 = rhead;
        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        return true;
    }
}
