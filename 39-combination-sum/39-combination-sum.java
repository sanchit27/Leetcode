class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        
        combSum(res,ans,candidates,target,0);
        return res;
        
    }
    public void combSum( List<List<Integer>> res,List<Integer> ans,int[] candidates, int target, int start)
    {
        
        if(target<0)
            return;
        for(int i=start;i<candidates.length;i++)
        {
            ans.add(candidates[i]);
            combSum(res,ans,candidates,target -candidates[i],i);
            ans.remove(ans.size()-1);
        }
         if(target==0)
            res.add(new ArrayList<>(ans));
      
    }
}