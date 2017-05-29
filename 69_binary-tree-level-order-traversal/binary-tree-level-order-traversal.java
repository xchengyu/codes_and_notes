/*
@Copyright:LintCode
@Author:   vadxin
@Problem:  http://www.lintcode.com/problem/binary-tree-level-order-traversal
@Language: Java
@Datetime: 16-06-29 01:39
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
 
 
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> in = new Stack<TreeNode>();
        Stack<TreeNode> out = new Stack<TreeNode>();
        int count = 0;
        in.push(root);
        count++;
        while (!in.isEmpty()) {
            while (count > 0) {
                out.push(in.pop());
                count--;
            }
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            while (!out.isEmpty()) {
                TreeNode obj = out.pop();
                tmp.add(obj.val);
                if (obj.left != null) {
                    in.push(obj.left);
                    count++;
                }
                if (obj.right != null) {
                    in.push(obj.right);
                    count++;
                }
            }
            res.add(tmp);
        }
        return res;
    }
}