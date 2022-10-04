class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        findpermute(res,ans,nums);
        
        return res;}
        
      private void findpermute(List<List<Integer>> res, List<Integer> ans, int[] nums)
        {
            for(int i=0;i<nums.length;i++)
            {
                 if(ans.contains(nums[i])) continue;
                ans.add(nums[i]);
                findpermute(res,ans,nums);
                ans.remove(ans.size()-1);
            }
          if(ans.size()==nums.length)
            res.add(new ArrayList<>(ans));
        }
        
        
    }
