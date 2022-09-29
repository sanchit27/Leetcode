class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp= new HashMap<Integer,Integer>();
        int count=0;
        int sum=0;
        mp.put(0,1);
        
        for(int n:nums)
        {
            sum+=n;
            int rem=sum%k;
            if(rem<0)
                rem+=k;
            if(mp.containsKey(rem))
                count+=mp.get(rem);
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return count;
    }
}