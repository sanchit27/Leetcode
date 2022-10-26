class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min,prices[i]);
            int prof=prices[i]-min;
            profit=Math.max(prof,profit);
            
            
        }
        return profit;
        
    }
}