class Solution {
    public int maxLength(List<String> arr) {
        int result[]= new int[1];
        getMaxLength(0,arr,"",result);
        return result[0];
        
    }
    public void getMaxLength(int index,List<String> arr,String str,int [] length)
    {
        if(index==arr.size())
        {
            if(unique(str)>length[0])
                length[0]=str.length();
            
                return;
            
        }
        getMaxLength(index+1,arr,str,length);
        getMaxLength(index+1,arr,str+arr.get(index),length);
    }
     public int unique(String currentStr) {
      int[] count = new int[26];
        for(char c : currentStr.toCharArray()) 
        { if(count[ c - 'a']++> 0) return -1;}
           return currentStr.length();
      
    }
}