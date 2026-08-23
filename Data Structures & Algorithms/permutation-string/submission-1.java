class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int ws = s1.length();
        int left = 0;
        int [] a = new int[26];
        int [] b = new int[26];
        


        for(int right = 0;right<s2.length();right++) {
            if(right<s1.length()) {
                a[s1.charAt(right)-'a']++;
                b[s2.charAt(right)-'a']++;

            }else {
                
                    b[s2.charAt(left)-'a']--;
                    left++;
                    b[s2.charAt(right)-'a']++;  
            }
            if(right >= (ws-1) &&Arrays.equals(a,b)) {  return true;
            }
        }
        return false;
    }
}
