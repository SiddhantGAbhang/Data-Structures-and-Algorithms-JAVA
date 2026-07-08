class Solution {
    public int[] sortedSquares(int[] nums) {
         int n = nums.length;

        // Case 1: all non-negative
        if (nums[0] >= 0) {
            for (int i = 0; i < n; i++)
                nums[i] = nums[i] * nums[i];
            return nums;
        }

        // Case 2: all non-positive
        if (nums[n - 1] <= 0) {
            int[] res = new int[n];
            for (int i = n - 1, j = 0; i >= 0; i--, j++)
                res[j] = nums[i] * nums[i];
            return res;
        }

        // Case 3: mixed → use two pointer
        int[] res = new int[n];
        int l = 0, r = n - 1, k = n - 1;

        while (l <= r) {
            int a = nums[l], b = nums[r];
            if (a * a > b * b) {
                res[k--] = a * a;
                l++;
            } else {
                res[k--] = b * b;
                r--;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna