import java.util.ArrayList;
import java.util.List;
/*Question: 94. Binary Tree Inorder Traversal.
Link: https://leetcode.com/problems/binary-tree-inorder-traversal/description/

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]
*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Lc94 {
    List<Integer> li = new ArrayList<>();

    void inorderTraverse(TreeNode root) {
        if (root == null)
            return;
        inorderTraverse(root.left);
        li.add(root.val);
        inorderTraverse(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return li;
        inorderTraverse(root);
        return li;
    }

    public static void main(String[] args) {
        // Example usage to test the inorderTraversal method
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Lc94 solution = new Lc94();
        List<Integer> result = solution.inorderTraversal(root);

        System.out.println("Inorder Traversal Result: " + result);
    }
}

