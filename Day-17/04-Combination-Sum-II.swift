class Solution {
    func combinationSum2(_ candidates: [Int], _ target: Int) -> [[Int]] {
        let nums = candidates.sorted()
        var ans = [[Int]]()
        var current = [Int]()
        
        func backtrack(_ start: Int, _ target: Int){
            if target == 0{
                ans.append(current)
                return
            }
            if target < 0 {
                return
            }
            for i in start..<nums.count {
                if i > start && nums[i] == nums[i-1]{
                    continue
                }
                current.append(nums[i])
                backtrack(i+1, target - nums[i])
                current.removeLast()
            }
        }
        backtrack(0, target)
        return ans
    }
}
