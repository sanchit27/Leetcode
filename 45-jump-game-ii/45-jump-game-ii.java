class Solution {
    public int jump(int[] nums) {
        int c=0;
        int s=0;
        int e=0;
        for(int i=0;i<nums.length-1;i++)
        {
            e=Math.max(e,i+nums[i]);
            
            if(i==s)
            {
                c++;
                s=e;
            }
        }
        return c;
        
    }
}