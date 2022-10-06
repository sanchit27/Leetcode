class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res= new ArrayList<>();
          if (digits == null || digits.length() == 0) {
            return res;
        }
        StringBuilder ans= new StringBuilder();
        String letters[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombinations(res,ans,digits,letters,0);
      
        return res;
    }
    public void letterCombinations(List<String> res,StringBuilder ans,String digits,String letters[],int start)
    {
        if(start==digits.length())
        {res.add(ans.toString());
           return;}
        
        int number=digits.charAt(start)-'0';
        String str=letters[number-2];
        for(int i=0;i<str.length();i++)
        {
            ans.append(str.charAt(i));
            letterCombinations(res,ans,digits,letters,start+1);
            ans.deleteCharAt(ans.length()-1);
            
        }
    }
}