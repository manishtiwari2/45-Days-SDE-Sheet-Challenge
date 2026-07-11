class Solution {
    public int kthElement(int a[], int b[], int k) {
        
        if(a.length > b.length){
            int[] temp = b;
            b = a;
            a = temp;
        }
        int n1 = a.length;
        int n2 = b.length;
        
        int low = Math.max(0,k-n2);
        int high = Math.min(k,n1);
        
        while(low <= high){
            int cut1 = low + (high - low) / 2;
            int cut2 = k-cut1;
            
            int left1;
            if(cut1 == 0){
                left1 = Integer.MIN_VALUE;
            } else {
                left1 = a[cut1-1];
            }

            int right1;
            if(cut1 == n1){
                right1 = Integer.MAX_VALUE;
            } else {
                right1 = a[cut1];
            }

            int left2;
            if(cut2 == 0){
                left2 = Integer.MIN_VALUE;
            } else {
                left2 = b[cut2 - 1];
            }

            int right2;
            if(cut2 == n2){
                right2 = Integer.MAX_VALUE;
            } else {
                right2 = b[cut2];
            }
            
            if(left1 <= right2 && left2 <= right1){
                return Math.max(left1,left2);
            } else if(left1 > right2) {
                high = cut1 - 1;
                
            }else {
                low = cut1 + 1;
            }
        }
        return -1;
        
    }
}