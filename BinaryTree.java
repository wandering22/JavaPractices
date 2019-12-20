class Node{
    char value;
    Node left;
    Node right;
    int size;

    public Node(char value){
        this.value=value;
        left=right=null;
        this.size=size;
    }
}

public class BinaryTree {

    public  void preOrder(Node root){
//    if(root==null){
//        return;
//    }
    if(root!=null){
        System.out.print(root.value);
        //size++;
        preOrder(root.left);
        preOrder(root.right);

    }
       // return size;
    }

    public void inOrder(Node root){
        //中序遍历   左根右
        if(root==null){
            return;
        }
        else{
            inOrder(root.left);
            System.out.print(root.value);

            inOrder(root.right);
        }
    }

    public void postOrder(Node root){
        //后序遍历
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value);
        }
    }
    int size=0;
    public int getSize1(Node root){
       // System.out.println(preOrder(root));
//        while (root!=null){
//            preOrder(root);
//            size++;
//        }
        if(root!=null){
            //System.out.print(root.value);
            size++;
            getSize1(root.left);
            getSize1(root.right);

        }
        return size;
    }

    public int getSize2(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;   //1是它本身（root）
    }

    int leafSize=0;
    public void getLeafSize1(Node root){       //叶子结点个数    ——遍历思路（前序遍历）

        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){    //叶子结点
            leafSize++;
            return ;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    public int getLeafSize2(Node root){    //子问题思路——等于左右叶子数之和
        if(root==null){

            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left)+getLeafSize2(root.right);

    }

    public int getKSize(Node root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getKSize(root.left,k-1)+getKSize(root.right,k-1);
    }

    public static Node buildTree(){
        //前序遍历
        Node root=new Node('A');
        Node node1=new Node('B');
        Node node2=new Node('C');
        Node node3=new Node('D');
        Node node4=new Node('E');
        Node node5=new Node('F');
        Node node6=new Node('G');
        Node node7=new Node('H');
        root.left=node1;
        root.right=node2;
        node1.left=node3;
        node1.right=node4;
        node2.left=node5;
        node2.right=node6;
        node4.right=node7;
        return root;
    }

    public static void main(String[] args) {

        BinaryTree bTree=new BinaryTree();
        Node root=buildTree();
        bTree.preOrder(root);
        System.out.println("");
      //  System.out.println(bTree.preOrder(root));
        System.out.println(bTree.getSize1(root));
        System.out.println(bTree.getSize2(root));

        bTree.inOrder(root);
        System.out.println("");
        bTree.postOrder(root);
        bTree.getLeafSize1(root);
        System.out.println("");
        System.out.println(bTree.size);
        System.out.println(bTree.leafSize);
        System.out.println(bTree.getLeafSize2(root));

        System.out.println(bTree.getKSize(root,3));
        System.out.println(bTree.getKSize(root,4));
    }
}
