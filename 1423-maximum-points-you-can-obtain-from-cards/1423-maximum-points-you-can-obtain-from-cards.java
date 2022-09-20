
class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int sum=0;
       int n=cardPoints.length;
        for(int i:cardPoints)
        {
            sum+=i;
        }
        int ans=0;
        int windows=0;
         if(n==k) 
             return sum;
        for(int i=0;i<n-k-1;i++)
        {
            windows=windows+cardPoints[i];
            System.out.println(cardPoints[i]);
            
        }
         
       for(int i=n-k-1;i<n;i++)
       {
            windows=windows+cardPoints[i];
           ans=Math.max(ans, sum-windows);
           windows-=cardPoints[i-(n-k-1)];
       }
        return ans;
}
}