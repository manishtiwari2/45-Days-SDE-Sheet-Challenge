class Solution {
    public int median(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            left = Math.min(left, mat[i][0]);
            right = Math.max(right, mat[i][m-1]);
        }
        int req = (n*m)/2;
        while(left <= right){
            int mid = left+(right-left)/2;
            int count = 0;
            for(int i = 0; i<n; i++){
                count += upperBound(mat[i], mid);
            }
            if(count <= req){
                left = mid+1;
            } else{
                right = mid-1;
            }
            
        }
        return left;
    }
    static int upperBound(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid = left+(right-left)/2;
            if(arr[mid] <= target) {
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}