class Solution {
    func partition(_ s: String) -> [[String]] {
        let chars = Array(s)
        var ans = [[String]]()
        var current = [String]()

        func isPalindrome(_ l: Int, _ r: Int) -> Bool {
            var l = l
            var r = r

            while l < r {
                if chars[l] != chars[r] {
                    return false
                }
                l += 1
                r -= 1
            }
            return true
        }
        func backtrack(_ start: Int) {
            if start == chars.count {
                ans.append(current)
                return
            }
            for end in start..<chars.count {
                if isPalindrome(start, end){
                    current.append(String(chars[start...end]))
                    backtrack(end+1)
                    current.removeLast()
                }
            }
        }
        backtrack(0)
        return ans
    }
}