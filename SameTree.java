
public class SameTree {
//判断两棵树是否相同
    public boolean isSame(Node root1,Node root2){
    if(root1==null&&root2==null){
        return true;

    }
    if(root1==null||root2==null){
        return false;
    }
    return root1.value==root2.value
            &&isSame(root1.left,root2.left)
            &&isSame(root1.right,root2.right);
    }
}
