/* Structure for tree and linked list
class Node {
  public int data;
  public Node left, right;

  public Node(int x) {
      data = x;
      left = right = null;
  }
};*/
class Solution {
    
    ArrayList<Node> list = new ArrayList<>();
    
    public Node treeToDLL(Node root) {
        inorder(root);
        if(list.isEmpty()){
            return null;
        }
        for(int i=0; i<list.size(); i++){
            Node curr = list.get(i);
            curr.left = (i == 0) ? null : list.get(i-1);
            curr.right = (i == list.size()-1) ? null : list.get(i+1);
        }
        return list.get(0);
    }

    private void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
};