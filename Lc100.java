/*Question: 100. Same Tree.
Link: https://leetcode.com/problems/same-tree/description/

Input: p = [1,2,3], q = [1,2,3]
Output: true

Input: p = [1,2], q = [1,null,2]
Output: false

Input: p = [1,2,1], q = [1,1,2]
Output: false
*/
public class Lc100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*This approach has TC: and SC: O(n) {n: No of nodes of the tree and depth of the tree} */
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null)
            return false;
        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
        // Create two sample binary trees
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Lc100 obj=new Lc100();
        boolean result = obj.isSameTree(p, q);

        // Output the result
        if (result) {
            System.out.println("The trees are equal.");
        } else {
            System.out.println("The trees are not equal.");
        }
    }
}
