class Solution {
    public int findPages(int[] arr, int k) {
        
        if(k > arr.length){
            return -1;
        }
        
        long left = 0;
        long right = 0;
        
        for(int page:arr){
            left = Math.max(left,page);
            right += page;
        }
        while(left <= right){
            long mid = left + (right-left)/2;
            if(canAllocate(arr,mid,k)){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int)left;
        
    }
    private boolean canAllocate(int[] pages, long maxPages, int k){
        int students = 1;
        
        long current = 0;
        for(int page : pages){
            if(current + page > maxPages){
                students++;
                current = page;
            }else {
                current += page;
            }
        }
        return students <= k;
    }
}