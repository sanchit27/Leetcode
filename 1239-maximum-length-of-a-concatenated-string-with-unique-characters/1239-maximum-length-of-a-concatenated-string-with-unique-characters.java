class Solution {
    private boolean unique(String str)
    {
        boolean freq[]= new boolean[26];
        char c[]=str.toCharArray();
        for(char ch: c)
        {
            if(freq[ch-'a']==true)
                return false;
            else
                freq[ch-'a']=true;
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        List<String> res= new ArrayList<>();
        res.add("");
        for(String str:arr)
        {
            if(!unique(str))
                continue;
            List<String> resappended= new ArrayList<>();
            for(String c:res)
            {
                String temp=c+str;
                if(unique(temp))
                    resappended.add(temp);
            }
            res.addAll(resappended);
            
        }
        int ans=0;
        for(String val:res)
            ans=Math.max(ans,val.length());
        
        return ans;
            
        
    }
}