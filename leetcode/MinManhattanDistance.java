class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i=0;i<points.length;i++) {
            if (x == points[i][0] || y == points[i][1]) {
                int distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (distance < min) {
                    minIndex = i;
                    min = distance;
                }
            }
        }
        return minIndex;
    }
}