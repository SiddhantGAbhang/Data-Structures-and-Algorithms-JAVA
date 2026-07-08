class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        for (int i=1; i<=x; i++){
            if (((long)i*i)<=x){
                ans = i;
            }else{
                break;
            }
        }  return ans;
    }
   
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna