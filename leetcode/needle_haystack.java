class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        
        if(needle.length() == 0)
            return 0;
        
        while(i<haystack.length()){
        if(haystack.charAt(i)==needle.charAt(j)){
            i++;j++;
            if(j == needle.length()){
                return Math.abs(i-j);
                }
            }
            i++;
        }
        
        return -1;
    }
}