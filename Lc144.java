import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Lc144 {
    /* This is code you to know for the solution of the problem */
    List<Integer> l=new ArrayList<>();
    public void preOrder(TreeNode root){        
        if(root==null)
            return;
        l.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }  
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return l;
    }
    /* Till here */
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Lc144 t=new Lc144();
        System.out.println(t.preorderTraversal(createTree()));
    }
    static TreeNode createTree(){
        TreeNode root=null;
        int data=sc.nextInt();
        if(data ==-1) return null;
        root=new TreeNode(data);
        root.left=createTree();
        root.right=createTree();
        return root;

    }
}
