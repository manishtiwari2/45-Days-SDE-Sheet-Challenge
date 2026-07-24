/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int findMaxFork(Node root, int k) {
        if(root == null){
            return -1;
        }
        if(root.data == k){
            return k;
        }
        if(root.data > k){
            return findMaxFork(root.left, k);
        }
        int rightFloor = findMaxFork(root.right, k);
        
        if(rightFloor == -1){
            return root.data;
        }
        return rightFloor;
    }
}
