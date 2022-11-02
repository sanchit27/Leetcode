class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map= new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            //if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(!map.containsKey(t.charAt(i)))
                return false;
                else
            {
              int x=map.get(t.charAt(i));
                if(x==1)
                    map.remove(t.charAt(i));
                    else
                        map.put(t.charAt(i),map.get(t.charAt(i))-1);
                
            }
        }
        return true;
    
        
    }
}