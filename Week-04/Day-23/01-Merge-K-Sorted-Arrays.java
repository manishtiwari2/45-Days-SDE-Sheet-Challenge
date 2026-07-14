class Solution {
	public ArrayList<Integer> mergeArrays(int[][] mat) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		int n = mat.length;
		int m = mat[0].length;
		PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
		for (int i = 0; i<n; i++) {
			pq.offer(new Node(mat[i][0], i, 0));
		}
		while (!pq.isEmpty()) {
			Node curr = pq.poll();
			ans.add(curr.val);
			if (curr.col + 1<m) {
				pq.offer(new Node(mat[curr.row][curr.col + 1], curr.row, curr.col + 1));
				
			}
		}
		return ans;
	}
}

class Node {
	int val;
	int row;
	int col;
	
	Node(int val, int row, int col) {
		this.val = val;
		this.row = row;
		this.col = col;
	}
}
