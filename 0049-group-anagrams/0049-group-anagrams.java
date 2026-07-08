class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> notebook =new HashMap<>();
        for (String s:strs){
            char chars[] = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if(!notebook.containsKey(sortedString)){
                notebook.put(sortedString, new ArrayList<>());
            }
            notebook.get(sortedString).add(s);
        }
        return new ArrayList<>(notebook.values());
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna