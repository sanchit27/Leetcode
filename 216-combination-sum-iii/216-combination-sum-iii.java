class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        combinationSumThree(res,ans,k,n,1,n);
        return res;
        
    }
    public void combinationSumThree(List<List<Integer>> res,List<Integer> ans, int k,int n,int start,int sum)
    {
   
          if(sum==0 && ans.size()==k)
          
          {res.add(new ArrayList<>(ans));}
           
        for(int i=start;i<10;i++)
        {
           
            ans.add(i);
            combinationSumThree(res,ans,k,n,i+1,sum-i);
            ans.remove(ans.size()-1);
            
        }
      
    }
}