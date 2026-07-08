class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        // Every child gets at least 1 candy
        int[] candies = new int[n];

        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        // Left to Right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to Left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calculate total candies
        int total = 0;
        for (int c : candies) {
            total += c;
        }

        return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna