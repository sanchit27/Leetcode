class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        permutationstwo(res, ans,nums, new boolean[nums.length]);
        return res;
    }
    public void permutationstwo(List<List<Integer>> res,List<Integer> ans,int nums[], boolean vis[])
    {
        if(ans.size()==nums.length && !res.contains(ans))
        {
        res.add(new ArrayList<>(ans));
        }

        for(int i=0;i<nums.length;i++)
        {
            if(vis[i])
                continue;
            //if(i>0 && nums[i]==nums[i-1] && vis[i-1])
               // continue;
            vis[i]=true;
            ans.add(nums[i]);
            permutationstwo(res,ans,nums,vis);
                vis[i]=false;
            ans.remove(ans.size()-1);
        
        }
    }
}