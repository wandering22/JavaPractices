class Node{
    int value;
    Node next;

    Node(int value, Node next){
        this.value=value;
        this.next=next;
    }
    Node(int x){
        this(x,null);
    }
}

public class Queue {
   // LinkedList s;
    int size;
    Node front;     //head
    Node rear;      //last


    public Queue(){
        front=rear=null;
        size=0;
    }

    public void offer(int x){
        Node node=new Node(x);

        if(rear==null){
            front=node;
        }else{
            rear.next=node;
        }
        rear=node;
        size++;
    }

    public void poll(){
        if(front==null){
            return;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
        size--;
    }


    public int peek(){
        if(front==null){
            return -1;
        }else
        return front.value;
    }

    public int rear(){
        return rear.value;
    }

    public int size(){
        return size;
    }

    public boolean empty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println(q.empty());
        System.out.println(q.size());
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.empty());
        System.out.println(q.size());
        while(!q.empty()){
            System.out.println(q.peek());
            q.poll();
        }
        System.out.println(q.empty());
        System.out.println(q.size());
    }
}
