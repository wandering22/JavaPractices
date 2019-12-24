public class BalancedTree {
    //判断是否平衡二叉树
    int getHeight(Node root){
        return root==null?0:Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    public boolean isBalanced(Node root) {
        if(root==null){
            return true;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.abs(left-right)<2
                &&isBalanced(root.left)
                &&isBalanced(root.right);    }
}
