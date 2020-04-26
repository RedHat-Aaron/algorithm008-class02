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
    public List<Integer> preorderTraversal(TreeNode root) {
        //前序遍历从上至下，从左至右
        //压栈顺序，先压根节点，后压右节点，再压左节点
        LinkedList<TreeNode> stack  = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(null == root){
            return res;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pollLast();
            res.add(node.val);
            if(null != node.right) stack.add(node.right);
            if(null != node.left) stack.add(node.left);
        }
        return res;
    }
}