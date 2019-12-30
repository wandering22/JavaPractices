public class Symmetric {
    //对称二叉树
    public boolean _isSymmetric(Node left,Node right){
        if(left==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        return left.value==right.value
                &&_isSymmetric(left.left,right.right)
                &&_isSymmetric(left.right,right.left);
    }
    public boolean isSymmetric(Node root) {
        if(root==null){
            return true;
        }
        return _isSymmetric(root.left,root.right);
    }

}

