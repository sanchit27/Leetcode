class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> set= new HashSet<>();
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
             for(int j=i+1;j<nums.length;j++)
             {
                 int val=Math.abs(nums[j]-nums[i]);
                  
                
                 
                 if(val==k && !set.contains(nums[j]))
                 { 
                     count++;
                     set.add(nums[j]);
                  System.out.println(nums[i]);
                  System.out.println(nums[j]);
                 }
             }
        }
        return count;
        
    }
}