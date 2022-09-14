class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map= new HashMap();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i]+1));
                count=nums[i];
            }else{
                map.put(nums[i],1);
            }
        }
        return count;
    }
}