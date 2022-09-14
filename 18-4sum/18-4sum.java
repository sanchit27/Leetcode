class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res= new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        
        long tar= Long.valueOf(target);
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            //int first=target- nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
               
                int start= j+1;
                int end= nums.length-1;
                while(start<end)
                {
                    long sum=Long.valueOf(nums[i]+nums[j])+Long.valueOf(nums[start]+nums[end]);
                    if(sum<tar)
                        start++;
                    else if(sum>tar)
                        end--;
                    else
                    {
                        List<Integer> list= new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        res.add(list);
                        while(start<end && list.get(2)==nums[start])
                            ++start;
                         while(start<end && list.get(2)==nums[end])
                            --end;
                        
                    }
                }
                while(j+1<n && nums[j+1]==nums[j])
                            j++;
            }
              while(i+1<n && nums[i+1]==nums[i])
                        i++;
        }
        return res;
    }
    
    
}