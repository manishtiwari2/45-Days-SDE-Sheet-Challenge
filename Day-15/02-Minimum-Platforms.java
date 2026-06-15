class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int n = arr.length;
        int i = 1;
        int j = 0;
        int platform = 1;
        int ans = 1;
        
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                platform++;
                ans = Math.max(ans, platform);
                i++;
            } else{
                platform--;
                j++;
            }
        }
        return ans;
    }
}
