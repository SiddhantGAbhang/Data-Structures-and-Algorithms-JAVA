class Solution {
    public boolean canReach(int[] arr, int start) {
         int n = arr.length;

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {

            int i = q.poll();

            // If value is 0
            if (arr[i] == 0) {
                return true;
            }

            // Forward jump
            int forward = i + arr[i];

            // Backward jump
            int backward = i - arr[i];

            // Check forward
            if (forward >= 0 && forward < n && !visited[forward]) {
                q.offer(forward);
                visited[forward] = true;
            }

            // Check backward
            if (backward >= 0 && backward < n && !visited[backward]) {
                q.offer(backward);
                visited[backward] = true;
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna