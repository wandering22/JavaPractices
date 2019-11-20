public class ReverseList{   

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
	//反转链表   两种方法
	public static Node reverseList(Node head){
		Node newhead=null;
		
		Node cur=head;
		while(cur!=null){
			Node next=cur.next;
			
			cur.next=newhead;
			newhead=cur;
			cur=next;
		}
		return newhead;
	}
	
	public static void main(String[] args){
	Node head=buildLinkedListHand();
	head=reverseList(head);
	 printLinkedList(head);
	}
}
	
	