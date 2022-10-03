class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        findsubset(0,nums,res,ans);
        return res;
        
    }
    public void findsubset(int i,int nums[],List<List<Integer>> res,List<Integer> ans)
    {
         res.add(new ArrayList<>(ans));
        
        for(int j=i;j<nums.length;j++)
        {
            ans.add(nums[j]);
            findsubset(j+1,nums,res,ans);
            ans.remove(ans.size()-1);
        }
       
        
    }
}