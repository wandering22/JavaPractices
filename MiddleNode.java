public class MiddleNode {
    //找中间
    public static int size(Node head){
        Node cur=head;
        int size=0;
        while(cur!=null){
            size++;
            cur=cur.next;
        }return size;
    }
    public static Node middleNode(Node head){
        int size =size(head);
        int steps=size/2;
        Node result=head;
        for(int i=0;i<steps;i++){
            result=result.next;
        }
        return result;

    }
}
