class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // assume first string is prefix

        for (int i = 1; i < strs.length; i++) {
            // while current string doesn't start with prefix, shorten prefix
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(sol.longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog","racecar","car"};
        System.out.println(sol.longestCommonPrefix(strs2)); // Output: ""
    }

}
