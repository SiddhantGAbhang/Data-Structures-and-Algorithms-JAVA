class Solution {
    public String defangIPaddr(String address) {
          StringBuilder result = new StringBuilder(address.length() + 6);

        for (char c : address.toCharArray()) {
            if (c == '.') result.append("[.]");
            else result.append(c);
        }

        return result.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna