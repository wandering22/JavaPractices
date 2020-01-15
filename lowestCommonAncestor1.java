public class lowestCommonAncestor1 {
    //二叉树的最近公共祖先
    public boolean find(TreeNode root,TreeNode node){
        if(root==null){
            return false;
        }
        if(root==node)
            return true;
        if(find(root.left,node))
            return true;
        return find(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            boolean pL;
            boolean pR;
            boolean qL;
            boolean qR;
            if(root==null)
                return root;
            if(root==p||root==q)
                return root;

            //同一边
            if(find(root.left,p)){
                pL=true;
                pR=false;
            }else{
                pR=true;
                pL=false;
            }
            if(find(root.left,q)){
                qL=true;
                qR=false;
            }else{
                qR=true;
                qL=false;
            }

        //同一边
        if(pL&&qL){
            return lowestCommonAncestor(root.left,p,q);
        }else if(pR&&qR){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            //两边
            return root;
        }
    }
}
