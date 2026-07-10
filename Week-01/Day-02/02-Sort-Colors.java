class Solution {
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length-1;

        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums, left, mid);
                left++;
                mid++;
            }
            else if (nums[mid] == 2){
                swap(nums,right,mid);
                right--;
            } else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}