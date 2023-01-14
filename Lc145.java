import java.util.*;
/*Question:- Binary Tree PostOrder Traversal
 *Link:-https://leetcode.com/problems/binary-tree-postorder-traversal/description/
    

Input: root = [1,null,2,3]
Output: [3,2,1]
Input: root = []
Output: []
Input: root = [1]
Output: [1]
*/
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
public class Lc145 {
    /* This is code you to know for the solution of the problem */
    List<Integer> l=new ArrayList<>();
    public void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        l.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return l;

    }
    /* Till here */
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Lc145 t=new Lc145();
        TreeNode r=createTree();
        System.out.println(t.postorderTraversal(r));
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
