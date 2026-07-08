class Solution {
    public int search(int[] nums, int target) {
        int le = 0;
        int ri = nums.length - 1;

        while (le <= ri) {
            int mid = le + (ri - le) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) le = mid + 1;
        
            else ri = mid - 1;
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna