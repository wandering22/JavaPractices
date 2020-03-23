class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class copyRandomList {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        //拷贝节点
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            Node copy = new Node(cur.val);
            cur.next = copy;
            copy.next = next;
            cur = next;
        }
        //链接随机指针
        cur = head;
        Node copy = head.next;
        while(cur != null){
            copy = cur.next;
            Node next = copy.next;
            if(cur.random != null){
                copy.random = cur.random.next;
            }
            else
                copy.random = null;

            cur = next;

        }
        //拆链
        cur = head;
        Node newH = head.next;
        copy = newH;
        while(cur != null){
            Node next = copy.next;
            cur.next = next;
            if(next != null)
                copy.next = next.next;
            cur = next;
            copy = copy.next;
        }
        return newH;
    }
}
