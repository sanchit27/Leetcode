class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int result = nums[0]+ nums[1]+nums[n-1];
        for(int i=0;i<nums.length-1;i++)
        {
            int start=i+1;
            int end= nums.length-1;
            while(start<end)
            {
                int sum= nums[i]+nums[start]+nums[end];
                if(sum<target)
                    start++;
                    else
                        end--;
                if(Math.abs(sum-target)<Math.abs(result-target))
                {
                    result=sum;
                }
            }
        }
        return result;
    }
}