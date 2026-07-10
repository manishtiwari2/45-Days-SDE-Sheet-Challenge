class Solution {
    public int nthRoot(int n, int m) {
        int left = 1;
        int right = m;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long val = power(mid, n, m);

            if (val == m) {
                return mid;
            } else if (val < m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    static long power(int base, int exp, int limit) {
        long result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;

            if (result > limit) {
                return result;
            }
        }

        return result;
    }
}