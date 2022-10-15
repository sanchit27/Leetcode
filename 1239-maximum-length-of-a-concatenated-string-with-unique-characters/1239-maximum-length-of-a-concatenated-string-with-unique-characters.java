class Solution {
    private boolean unique(String str)
    {
        //if(str.length()>26)
            //return false;
        int freq[]= new int[26];
        char c[]=str.toCharArray();
        for(char ch:c)
        {
            freq[ch-'a']++;
            if(freq[ch-'a']>1)
                return false;
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
            List<String> reswithappendedstring= new ArrayList<>();
            for(String result:res)
            {
                String temp=result+str;
                if(unique(temp))
                    reswithappendedstring.add(temp);
            }
            
            res.addAll(reswithappendedstring);
            System.out.println(res);
            
        }
        int ans=0;
        for(String r:res)
           ans= Math.max(ans,r.length());
        return ans;
        
    }
}