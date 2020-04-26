class Solution {
    public boolean isAnagram(String s, String t) {
        /*char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        if(sChar.length != tChar.length){
            return false;
        }
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);*/
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c:count){
            if(0 != c){
                return false;
            }
        }
        return true;
    }
}