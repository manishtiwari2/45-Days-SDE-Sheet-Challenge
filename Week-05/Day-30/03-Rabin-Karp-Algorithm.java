class Solution {
	public ArrayList<Integer> rabinKarp(String text, String pattern) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		int n = text.length();
		int m = pattern.length();
		
		if (m > n) {
			return ans;
		}
		int base = 31;
		int mod = 1000000007;
		
		long patternHash = 0;
		long textHash = 0;
		long power = 1;
		
		for (int i = 0; i < m - 1; i++) {
			power = (power * base) % mod;
		}
		for (int i = 0; i < m; i++) {
			patternHash = (patternHash * base + pattern.charAt(i)) % mod;
			textHash = (textHash * base + text.charAt(i)) % mod;
		}
		
		for (int i = 0; i <= n - m; i++) {
			if (patternHash == textHash) {
				
				int j = 0;
				while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
					j++;
				}
				if (j == m) {
					ans.add(i);
				}
			}
			if (i < n - m) {
				textHash = (textHash - text.charAt(i) * power % mod + mod) % mod;
				textHash = (textHash * base + text.charAt(i + m)) % mod;
			}
		}
		return ans;
	}
}
