public class MyLinkedList{
	public static Node buildLinkedListHand(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		//1 2 3 4 5
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		return n1;
	}
	
	public static void printLinkedList(Node head){
		Node cur=head;
		 
		while(cur!=null){
			System.out.println(cur.val);
			cur=cur.next;
			
		}		
	}
	public static Node pushFront(Node head,int val){
		Node node =new Node(val);
		node.next=head;
		return node;
	}
	
	public static Node popFront(Node head){
		if(head==null){
			throw new RuntimeException("空链表");
		}
		return head.next;
	}
		// Node node=new Node(); 
		// head=null;
		// return node;
	// }
	
	 
	//尾插 分两种情况  1.链表中至少有一个结点   2.没有结点
	public static Node pushBack(Node head,int val){
		Node node=new Node(val);
		if(head==null){          //链表中没有结点
			head=node;
			return node;
		}else{                   //至少有一个
			Node cur=head;
			while(cur.next!=null){
				cur=cur.next;
			}
			cur.next=node;        //cur.next一定是null
			return head;
		}
	}
	
	//尾删   三种情况   1.至少有两个结点    2.一个结点       3.错误：没有结点
	public static Node popBack(Node head){  
		if(head==null){
			throw new RuntimeException("空的");
		}
		if(head.next==null){
			return null;
		}else{
			Node cur=head;
			while(cur.next.next!=null){
				cur=cur.next;
			}
			cur.next=null;
			return head;
	}
	}
	
	public static void main(String[] args){
		// Node head=buildLinkedListHand();
		// printLinkedList(head);
		
		
		
		
		
		Node head=null;
		head=pushBack(head,1);
		head=pushBack(head,2);
		head=pushBack(head,3);
		head=pushBack(head,4);
		head=pushBack(head,5);
		printLinkedList(head);
		
		head=popBack(head);
		head=popBack(head);
		head=popBack(head);
		printLinkedList(head);
		head=popBack(head);
		head=popBack(head);
		printLinkedList(head);
	}
		
		
}