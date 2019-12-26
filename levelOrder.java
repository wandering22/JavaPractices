import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
    //层次遍历    队列思想

    public void levelOrder(Node root){
        Queue<Node> queue=new LinkedList<>();
        if(root!=null){
            queue.offer(root);
            while(!queue.isEmpty()){
                Node top=queue.poll();
                System.out.println(top);
                if(top.left!=null){
                    queue.offer(top.left);
                }
                if(top.right!=null){
                    queue.offer(top.right);
                }
            }
        }
    }
}
