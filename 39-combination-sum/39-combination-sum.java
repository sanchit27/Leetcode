class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        backtracking(candidates, target, result, list, 0);
        return result;
    }
        
        public void backtracking(int candidates[], int target, List<List<Integer>> result, List<Integer> list, int i)
        {
            if(target<0)
                return;
            if(target==0)
            { result.add(new ArrayList<>(list));
             return;
            }
            
        
        if(i==candidates.length)
            return;
            if(target>=candidates[i])
            {
                list.add(candidates[i]);
                backtracking(candidates,target-candidates[i],result,list,i);
                list.remove(list.size()-1);
            }
            
            backtracking(candidates,target,result,list,i+1);
        }
        
        
        
    
}