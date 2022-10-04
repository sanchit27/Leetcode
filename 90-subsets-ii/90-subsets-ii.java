class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        subsetstwo(res,ans,nums,0);
        return res;
    }
    public void subsetstwo(List<List<Integer>> res,List<Integer> ans, int nums[],int start)
    {
          res.add(new ArrayList<>(ans));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1])
                continue;
            ans.add(nums[i]);
            subsetstwo(res,ans,nums,i+1);
            ans.remove(ans.size()-1);
        }
       // res.add(new ArrayList<>(ans));
    }
}