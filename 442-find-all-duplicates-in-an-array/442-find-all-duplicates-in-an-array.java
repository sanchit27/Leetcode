class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> mp= new HashMap<>();
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                int count=mp.get(nums[i]);
                count++;
                mp.put(nums[i],count);
                list.add(nums[i]);
            }else
            {
                mp.put(nums[i],1);
            }
        }
        
     
        return list;
    }
    
}