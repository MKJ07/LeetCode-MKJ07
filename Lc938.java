/*Question: 938. Range Sum of BST.
Link: https://leetcode.com/problems/range-sum-of-bst/description/

Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
*/

class TreeNode { // Class for BST Declaration
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class Lc938 {
    static int sum = 0;

    void inorder(TreeNode root, int l, int h) {
        if (root == null) {
            return;
        }
        inorder(root.left, l, h);
        if (root.val >= l && root.val <= h) {
            sum += root.val;
        }
        inorder(root.right, l, h);
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        /*This code has both TC: O(N) and SC: O(N) */
        Lc938 obj = new Lc938();
        obj.inorder(root, low, high);
        int res = sum;
        sum = 0;
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        Lc938 solution = new Lc938();

        int result = solution.rangeSumBST(root, 7, 15);

        System.out.println("Sum of values in the range: " + result);
    }
}
