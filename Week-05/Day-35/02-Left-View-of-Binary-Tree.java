/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,0,ans);
        return ans;
    }
    private void dfs(Node root, int depth, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        if(depth == ans.size()){
            ans.add(root.data);
        }
        dfs(root.left, depth+1, ans);
        dfs(root.right, depth+1,ans);
    }
}