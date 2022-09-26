class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        findsubset(nums,0,ans,res);
        
        return res;
    }
    public void findsubset(int nums[],int i,List<Integer> ans,List<List<Integer>> res)
    {
     if(i==nums.length)
     {
         res.add(new ArrayList<>(ans));
         return;
     }
        ans.add(nums[i]);
        findsubset(nums,i+1,ans,res);
        ans.remove(ans.size()-1);
        findsubset(nums,i+1,ans,res);
    }
}