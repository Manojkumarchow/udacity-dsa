class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int i=0;
        int j=0;
        while (i < word1.length() && j < word2.length()) {
            result += String.valueOf(word1.charAt(i));
            result += String.valueOf(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
             result += String.valueOf(word1.charAt(i));
             i++;
        }
        
        while (j < word2.length()) {
             result += String.valueOf(word2.charAt(j));
             j++;
        }
        return result;
    }
}