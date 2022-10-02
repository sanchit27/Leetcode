class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(
          "[^a-zA-Z0-9]", "");
        s=s.toLowerCase();

        System.out.println(s.length());
        int j=s.length()-1;
        int i=0;
        if(s.length()==0||s.length()==1)
            return true;
    
        while(i!=j)
        {if(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }else
            return true;
        }
        
        
        return true;
        
    }
}