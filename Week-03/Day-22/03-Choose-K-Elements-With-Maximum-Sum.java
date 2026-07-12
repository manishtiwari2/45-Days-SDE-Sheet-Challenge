class Pair {
    int num1;
    int num2;
    int index;

    Pair(int num1, int num2, int index) {
        this.num1 = num1;
        this.num2 = num2;
        this.index = index;
    }
}

class Solution {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        Pair[] arr = new Pair[n];
        for(int i=0; i<n; i++){
            arr[i] = new Pair(nums1[i], nums2[i],i);
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(a.num1, b.num1));
        long[] ans = new long[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        int i = 0;
        while(i<n){
            int j = i;
            while(j<n && arr[j].num1 == arr[i].num1){
                j++;
            }
            for(int t=i; t<j; t++){
                ans[arr[t].index] = sum;
            }
            for(int t=i; t<j; t++){
                pq.offer(arr[t].num2);
                sum += arr[t].num2;

                if(pq.size() > k){
                    sum -= pq.poll();
                }
            }
            i = j;
        }
        return ans;

    }
}
