import sun.reflect.generics.tree.Tree;

import java.util.Stack;

public class ZhongXu {
    //递归
    public static void zhong(TreeNode root) {
        if (root != null) {
            zhong(root.left);
            System.out.println(root);
            zhong(root.right);
        }

    }
    //非递归
    public static void zhongXu(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        while(root!=null||!st.isEmpty()){
            while(root!=null){
                st.push(root);
                root=root.left;

            }
            root=st.pop();
            System.out.println(root.val);
            root=root.right;
        }
    }
}
