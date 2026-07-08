class Solution {
    public char nextGreatestLetter(char[] letter, char target) {
         int left = 0, right = letter.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letter[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // If no greater character found, return first element (wrap-around)
        return letter[left % letter.length];
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna