class Solution {
    public int subtractProductAndSum(int n) {
        int sumOfDigits = sumDigits(n);
        int productOfDigits = product(n);
        // System.out.println(productOfDigits);
        return productOfDigits - sumOfDigits;
    }
    
    static int sumDigits(int num) {
        return num == 0 ? 0 : num%10 +
                  sumDigits(num/10) ;
    }
    
    static int product(int num) {
        return num == 0 ? 1 : num%10 *
                  product(num/10) ;
    }
}