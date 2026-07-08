class Solution {
    public int maxProduct(int[] nums) {
       int max1=0;
        int max2=0;
        for(int n: nums){
            if(max1<n){
                max2=max1;
                max1=n;
            }else if(max2<n){
                max2=n;
            }
        }
        return ((max1-1)*(max2-1));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna