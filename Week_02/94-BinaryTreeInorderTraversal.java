/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //中序遍历：左根右
        List<Integer> res = new  ArrayList<>();
        helper(root,res);
        return res;
    }

    private void helper(TreeNode root,List<Integer> res){
        if(null == root){
            return;
        }
        if(null != root.left) helper(root.left,res);
        res.add(root.val);
        if(null != root.right) helper(root.right,res);
    }
}