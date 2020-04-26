/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        if(null != root) getLevelRes(root,0);
        return res;
    }

    public void getLevelRes(Node root,int level){
        if(res.size() <= level){
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);
        for(Node child : root.children){
            getLevelRes(child,level+1);
        }
    }
}