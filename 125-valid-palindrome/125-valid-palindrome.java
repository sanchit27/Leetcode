class Solution {
    public boolean isPalindrome(String s) {
        //s = s.replaceAll(
          //"[^a-zA-Z0-9]", "");
        s=s.toLowerCase();

        System.out.println(s.length());
        int j=s.length()-1;
        int i=0;
        if(s.length()==0||s.length()==1)
            return true;
        while(i<j)
        {
            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='0'&&s.charAt(i)<='9')))
            { i++;}
    
            while(i<j && !((s.charAt(j)>='a'&& s.charAt(j)<='z')||(s.charAt(j)>='0'&& s.charAt(j)<='9')))
         {j--;}
          
            
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
       
        
    }
        
        return true;
        
    }
}