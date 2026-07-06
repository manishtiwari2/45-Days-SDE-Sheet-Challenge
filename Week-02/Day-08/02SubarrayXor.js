

class Solution {
    subarrayXor(arr, k) {
        const map = new Map();
        map.set(0,1);
        
        let xor = 0;
        let count = 0;
        
        for(const num of arr){
            xor ^= num;
            const needed = xor^k;
            if(map.has(needed)){
                count+= map.get(needed);
            }
            map.set(xor,(map.get(xor) || 0) + 1);
        }
        return count;
    }
}
