class Solution {
    func subsetsWithDup(_ nums: [Int]) -> [[Int]] {
        let nums = nums.sorted()
        var ans = [[Int]]()
        var current = [Int]()

        func backtrack(_ index: Int){
            ans.append(current)
            for i in index..<nums.count {
                if i > index && nums[i] == nums[i-1] {
                    continue
                }
                current.append(nums[i])
                backtrack(i+1)
                current.removeLast()
            }
        }
        backtrack(0)
        return ans;
    }
}