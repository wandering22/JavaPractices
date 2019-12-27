//import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder2{
    //层次遍历

        public List<List<Integer>> levelOrderBottom(Node root) {
            List<List<Integer>> Mat=new LinkedList<>();
            Queue<Node> queue=new LinkedList<>();
            if(root!=null){
                queue.offer(root);

            }
            while(!queue.isEmpty()){
                int size=queue.size();
                List<Integer> rowNode=new LinkedList<>();
                while(size>0){
                    Node top=queue.poll();
                    rowNode.add(top.value);
                    if(top.left!=null)
                        queue.offer(top.left);
                    if(top.right!=null){
                        queue.offer(top.right);
                    }
                    size--;
                }
                Mat.add(rowNode);
            }
            return Mat;
        }
    }

