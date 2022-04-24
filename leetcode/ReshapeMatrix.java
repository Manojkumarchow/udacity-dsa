class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c)
            return mat;
        
        int x = 0,  y = 0;
        
        int[][] result = new int[r][c];
        
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                result[x][y++] = mat[i][j];
                
                if (y == c) {
                    y=0;
                    x++;
                }
            }
        }
        return result;
    }
}