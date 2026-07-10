class Solution {
    func getPermutation(_ n: Int, _ k: Int) -> String {
        var numbers = Array(1...n)
        var fact = 1
        for i in 1..<n {
            fact *= i
        }
        var k = k-1
        var ans = ""
        while true {
            ans += String(numbers[k/fact])
            numbers.remove(at: k/fact)
            if numbers.isEmpty {
                break
            }
            k %= fact
            fact /= numbers.count
        }
        return ans
        
    }
}