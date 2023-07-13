class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows=accounts.length;
        int col=accounts[0].length;
        int maxWealth=0;
        for(int i=0;i<rows;i++){
            int wealth=0;
            for(int j=0;j<col;j++){
                wealth+=accounts[i][j];
                maxWealth=Math.max(wealth,maxWealth);
            }
        }
        return maxWealth;
        
        
    }
}