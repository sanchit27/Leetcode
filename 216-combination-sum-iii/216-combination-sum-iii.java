class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<Integer> ans= new ArrayList<>();
        combinationSumThree(n,k,1,ans,n);
        return res;
        
    }
    public void combinationSumThree(int target,int k ,int index,List<Integer> list,int sum)
    {
   
          if(sum==0 && list.size()==k)
          
          {res.add(new ArrayList<>(list));}
           
        for(int i=index;i<10;i++)
        {
           
            list.add(i);
            combinationSumThree(target, k, i + 1, list, sum - i);
            list.remove(list.size()-1);
            
        }
      
    }
}