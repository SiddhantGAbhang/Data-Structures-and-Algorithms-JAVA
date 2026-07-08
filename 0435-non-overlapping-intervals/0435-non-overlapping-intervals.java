class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort (intervals, (a,b)-> Integer.compare(a[1], b[1]));

        int removed = 0;
        int lastTime = Integer.MIN_VALUE;

        for (int[]interval:intervals){
            int startTime = interval[0];
            int end = interval[1];

            if (startTime<lastTime){
                removed++;
            }else{
                lastTime = end;
            }
        }
        return removed;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna