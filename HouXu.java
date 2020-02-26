import java.util.Stack;

public class HouXu {
    //递归
    public static void hou(TreeNode root){

        if(root!=null){
            hou(root.left);
            hou(root.right);
            System.out.println(root);
        }
    }
    //非递归
    public static void houXu(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        TreeNode cur=root;
        TreeNode prev=null;
        while(cur!=null||!st.isEmpty()){
            while(cur!=null){
                st.push(cur);
                cur=cur.left;

            }
            cur=st.peek();
            if(cur.right==null||cur.right==prev) {
                System.out.println(root.val);
                prev = cur;
                st.pop();
                cur = null;
            }else{
            cur=cur.right;
    }
}}}
