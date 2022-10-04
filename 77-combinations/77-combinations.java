class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        combinations(1,n,k,ans,res);
        return res;
        
    }
public void combinations(int start, int n,int k,List<Integer> ans,List<List<Integer>> res)
    {
        if(ans.size()==k)
            res.add(new ArrayList<>(ans));
        for(int i=start;i<=n;i++)
        {
            ans.add(i);
            combinations(i+1,n,k,ans,res);
            ans.remove(ans.size()-1);
        }
    }
}
