class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set= new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
           
            if(set.contains(nums[i]))
            {
                list.add(nums[i]);
            }else
            {
                set.add(nums[i]);
            }
        }
        
     
        return list;
    }
    
}