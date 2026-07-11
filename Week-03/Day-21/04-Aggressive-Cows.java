class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 1;
        int right = arr[arr.length - 1] - arr[0];
        while(left <= right){
            int mid = left + (right-left)/2;
            if(canPlace(arr, mid,k)){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return right;
    }
    
    private boolean canPlace(int[] arr,int distance, int k){
        int cows = 1;
        int lastPos = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] - lastPos >= distance){
                cows++;
                lastPos = arr[i];
                if(cows >= k){
                    return true;
                }
            }
        }
        return false;
    }
}
