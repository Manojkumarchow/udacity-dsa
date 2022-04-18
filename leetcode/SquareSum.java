class Solution {
    public boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long) Math.sqrt(c);
        
        while (start <= end) {
            long sum = ( start * start ) + ( end * end );
            if (c == sum) {
                return true;
            } else if ( c > sum) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}