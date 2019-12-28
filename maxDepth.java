public class maxDepth {
//返回树的最大深度
    public int maxDepth(Node root){
        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
