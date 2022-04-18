class Solution {
    public int countOdds(int low, int high) {
//         if m and n are given
//         n - m + 1 / 2  + 1 -> for odds
        if(low%2!=0 && high%2!=0) 
            return ((high-low+1)/2)+1;
        else
            return (high-low+1)/2;
    }
}