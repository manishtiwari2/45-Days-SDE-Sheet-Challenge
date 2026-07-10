class Solution {

    public int[] findMissingRepeatingNumbers(int[] nums) {

        int n = nums.length;

        long actualSum = 0;
        long actualSquareSum = 0;

        for(int num : nums) {
            actualSum += num;
            actualSquareSum += (long) num * num;
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        long S = actualSum - expectedSum;

        long sqDiff = actualSquareSum - expectedSquareSum;

        long P = sqDiff / S;

        int repeating = (int)((S + P) / 2);

        int missing = (int)(repeating - S);

        return new int[]{repeating, missing};
    }
}
