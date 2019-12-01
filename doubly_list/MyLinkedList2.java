package doubly_list;

public class MyLinkedList2 {
    Node head = null;

    Node last = null;
    int size = 0;


    public Node pushFront(Node head,int val) {
        Node node = new Node(val);
        node.next = head;
        if(head!=null) {
            head.prev = node;
        }

        head = node;

        if (head.next == null) {
            last = head;
        }
        size++;
        return head;
    }

    public Node popFront(Node head) {
        if (size == 0) {
            throw new RuntimeException("空了！");
        }


        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            last = null;
        }
        size--;
        return head;
    }

    public Node pushBack(Node head,int val) {
        Node node = new Node(val);
        if (last != null) {
            last.next = node;
            node.prev = last;
            last = node;
        } else {
            last = head = node;
        }
        size++;
        return head;
    }

    public void popBack() {
        if (size == 0) {
            throw new RuntimeException("空了！");
        }
        if (last.prev != null) {
            last.prev.next = null;
            last = last.prev;

        } else {
            head = last = null;
        }
        size--;

    }
}

