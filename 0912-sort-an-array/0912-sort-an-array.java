class Solution {
    public int[] merge2sortArrays(int left[], int right[]) {
    int i = 0, j = 0, k = 0;
        int ans[] = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }

    public int[] sortArray(int[] nums) {
        int size = nums.length;

        if (size <= 1) return nums;

        int left[] = Arrays.copyOfRange(nums, 0, size / 2);
        int right[] = Arrays.copyOfRange(nums, size / 2, size);

        left = sortArray(left);
        right = sortArray(right);

        return merge2sortArrays(left, right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna