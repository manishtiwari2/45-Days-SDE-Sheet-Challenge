class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
            
            if(mat[a][b] == 1){
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int candidates = st.pop();
        for(int i=0; i<n; i++){
            if(i == candidates){
                continue;
            }
            if(mat[candidates][i] == 1){
                return -1;
            }
            if(mat[i][candidates] == 0){
                return -1;
            }
        }
        return candidates;
    }
}
