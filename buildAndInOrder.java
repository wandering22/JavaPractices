import java.util.Scanner;

public class buildAndInOrder {
    //二叉树的构建及遍历
    static int i=0;
    public static Node build(String s){
        if(s.charAt(i)!='#'){
            Node root=new Node(s.charAt(i));
            i++;
            root.left=build(s);
            i++;
            root.right=build(s);
            return root;
        }
        return null;
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.value+" ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String line=scanner.nextLine();
        //i=0;
        Node root=build(line);
        inOrder(root);
        System.out.println();
    }
}
