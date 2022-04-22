class Solution {
    int count = 0;

    public boolean isHappy(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += (temp * temp);
            n /= 10;
        }
        count++;
        if (sum == 1) {
            return true;
        } else {
            if (count > 7) {
                // since 7 is a happy number if we look at 7^2 = 49 --> which leads to a number
                // ending with 1. So, we are considering any number that is greater than count of 7 to be false.
                return false;
            } else {
                return isHappy(sum);
            }
        }

    }

}