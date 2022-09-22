class Solution {
    public int[] plusOne(int[] digits) {
        int start=0;
        int end=digits.length-1;
        while(start<=end)
        {
            if(digits[end]+1!=10)
            {
                digits[end]=digits[end]+1;
                return digits;
            }
            else
            {
                digits[end]=0;
                System.out.print(end);
                end--;
            }
        }
        if(digits[0]==0)
        {
            int val[]= new int[digits.length+1];
            val[0]=1;
            return val;
        }
      // throw new IllegalArgumentException("No format");
         return digits;
    }
}