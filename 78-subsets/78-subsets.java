class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        findsubset(nums,0,ans,res);
        return res;
    }
    public void findsubset(int nums[],int i,List<Integer> ans,List<List<Integer>> res)
    {
        for(int j=i;j<nums.length;j++)
        {
            ans.add(nums[j]);
            findsubset(nums,j+1,ans,res);
            ans.remove(ans.size()-1);
        }
        res.add(new ArrayList<>(ans));
        
    }
}