class Solution {
    public int maximumWealth(int[][] account) {
        int maxWealth = Integer.MIN_VALUE;
        
        for (int i=0;i<account.length;i++) {
            int eachPersonWealth = 0;
            for (int j=0;j<account[i].length;j++) {
                eachPersonWealth += account[i][j];
            }
            if (eachPersonWealth > maxWealth)
                maxWealth = eachPersonWealth;
        }
        return maxWealth;
    }
}