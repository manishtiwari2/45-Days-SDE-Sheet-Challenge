import java.util.*;

class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        solve(0, 0, arr, ans);

        Collections.sort(ans);
        return ans;
    }

    private void solve(int idx, int sum, int[] arr, ArrayList<Integer> ans) {
        if (idx == arr.length) {
            ans.add(sum);
            return;
        }

        // Pick current element
        solve(idx + 1, sum + arr[idx], arr, ans);

        // Don't pick current element
        solve(idx + 1, sum, arr, ans);
    }
}