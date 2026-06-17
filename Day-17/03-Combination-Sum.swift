class Solution {
    func combinationSum(_ candidates: [Int], _ target: Int) -> [[Int]] {
        var ans = [[Int]]()
        var current = [Int]()

        func solve(_ idx: Int, _ target: Int){
            if idx == candidates.count {
                if target == 0 {
                    ans.append(current)
                }
                return
            }
            if candidates[idx] <= target {
                current.append(candidates[idx])
                solve(idx, target - candidates[idx])
                current.removeLast()
            }
            solve(idx+1,target)
        }
        solve(0,target)
        return ans
    }
}