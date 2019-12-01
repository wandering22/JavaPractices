package MyLinked;

public class Node {
    int val;
    Node next;
    Node prev;

    Node(int val, Node next, Node prev){
        this.val=val;
        this.next=next;
        this.prev=prev;
    }
    Node(int val, Node next){
        this.val=val;
        this.next=next;
    }

    Node(int val){
        this(val,null,null);
    }
    @Override
    public String toString(){
        return String.format("Null{%d}",val);
    }
}
