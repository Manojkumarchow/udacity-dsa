class ValidSquare {
    public boolean isPerfectSquare(int num) {
        long start = 0, end = num;
        long mid;
        long square;
        
        while (start <= end) {
            mid = start + (end - start) / 2;
            square = mid * mid;
            if (square == num) {
                return true;
            } else if ( square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}