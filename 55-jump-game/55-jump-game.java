class Solution {
    public boolean canJump(int[] nums) {
        int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++)
        {
            if(e<i)
                return false;
            e=Math.max(e,i+nums[i]);
            
            
        }
        //System.out.println(e);
       
      
         
        return true;
        
    }
}