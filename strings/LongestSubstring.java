
class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        java.util.Set<Character> set=new java.util.HashSet<>();
        int l=0,max=0;
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
