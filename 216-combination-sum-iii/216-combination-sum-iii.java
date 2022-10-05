class Solution {
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        combinationSumThree(n,k,1,ans,n,res);
        return res;
        
    }
    public void combinationSumThree(int n,int k ,int start,List<Integer> ans,int sum,List<List<Integer>> res)
    {
   
          if(sum==0 && ans.size()==k)
          
          {res.add(new ArrayList<>(ans));}
           
        for(int i=start;i<10;i++)
        {
           
            ans.add(i);
            combinationSumThree(n, k, i + 1, ans, sum - i,res);
            ans.remove(ans.size()-1);
            
        }
      
    }
}