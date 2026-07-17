/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    
    public ArrayList<Integer> inOrder(Node root) {
        helper(root);
        return res;
    }
    private void helper(Node root){
        if(root == null){
            return;
        }
        else{
            helper(root.left);
            res.add(root.data);
            helper(root.right);
        }
    }
}