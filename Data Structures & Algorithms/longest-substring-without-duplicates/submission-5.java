class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        if(s.isBlank()) {
            return 1;
        }
        int left = 0;
        int maxLen = 0;
        Set<Character> window = new HashSet();
        for(int right = 0;right<s.length();right++) {
            if(window.contains(s.charAt(right))) {
                while(window.contains(s.charAt(right))) {
                    window.remove(s.charAt(left));
                    left++;
                }
            }
            window.add(s.charAt(right));
            maxLen = Math.max(window.size(), maxLen);

        }
        return maxLen;


    }
}
