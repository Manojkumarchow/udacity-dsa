class Solution {
    public int diagonalSum(int[][] mat) {
        int principal = 0, secondary = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            principal += mat[i][i];
            secondary += mat[i][n - i - 1];
        }
        int sum = principal + secondary;
        // deleting the repeated middle element
        if(n % 2 != 0){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}