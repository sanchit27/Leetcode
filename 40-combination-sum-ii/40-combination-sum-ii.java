class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumtwo(res,ans,target,candidates,0);
        return res;
        
        
    }
    public void combinationSumtwo(List<List<Integer>> res,List<Integer> ans, int target, int[] candidates,int start)
    {
        if(target<0)
            return;
        for(int i=start;i<candidates.length;i++)
        {
            if(i>start && candidates[i]==candidates[i-1])
                continue; //remove duplicates
            ans.add(candidates[i]);
            combinationSumtwo(res,ans,target-candidates[i],candidates,i+1);
            ans.remove(ans.size()-1);
            
        }
        if(target==0)
            res.add(new ArrayList<>(ans));
            
        
    }
}