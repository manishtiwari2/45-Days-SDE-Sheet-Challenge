class Solution {
    
    static final long MOD = 1000000007L;
    
    public int sumOfLengths(int arr[]) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
        int left = 0;
        long ans = 0;
        
        for(int right = 0; right < n; right++){
            
            while(set.contains(arr[right])){
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
            long len = right - left + 1L;
            ans = (ans + (len*(len + 1L) / 2) % MOD) % MOD;
        }
        return (int) ans;
        
    }
}
