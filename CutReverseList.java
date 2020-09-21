import java.util.*;



public class CutReverseList {
    /**
     *
     * @param head ListNode类 
     * @param m int整型 
     * @param n int整型 
     * @return ListNode类
     */
    public ListNode solution (ListNode head, int m, int n) {
        // write code here
        ListNode nhead=null;
        ListNode cur=head;
        List<Integer> list=new ArrayList<>();
        while(cur.next!=null){
            list.add(cur.val);
            cur=cur.next;

        }
        int [] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        for(int i=m-1;i<(n+1-m)/2;i++){
            int tmp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=tmp;

        }
        ListNode ncur=nhead;


        /*for(int i=0;i<list.size();i++){
            ncur.val=arr[i];
            ncur=ncur.next;
        }*/
        nhead=a(arr);
        return nhead;
    }
    public ListNode a(int[] s){
        ListNode root=new ListNode(s[0]);
        ListNode o=root;
        for(int i=1;i<s.length;i++){
            ListNode tmp=new ListNode(s[i]);
            o.next=tmp;
            o=tmp;
        }
        return root;
    }
}
