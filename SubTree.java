//判断一棵树是否是另一棵树的子树
public class SubTree {
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
    public boolean isSub(Node root1,Node root2){
        if(root1==null){
            return false;
        }
        if(isSame(root1,root2)){
            return true;
        }
        if(isSub(root1.left,root2)){
            return true;
        }
        return isSub(root1.right,root2);
//       if(root1.value==root2.value){
//            if(isSame(root1.left,root2.left)&&isSame(root1.right,root2.right)){
//                return true;
//            }else{
//
//            }
//       }
    }
}
