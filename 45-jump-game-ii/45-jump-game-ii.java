class Solution {
    public int jump(int[] nums) {
        
        int count=0;
        int start=0;
        int end=0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            end= Math.max(end,i+nums[i]);
            if(i==start)
            {
                count++;
                start=end;
            }
        }
        return count;
        
    }
}