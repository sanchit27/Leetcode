class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        for(int num:nums)
        {
            set.add(num);
        }
        int i=1;
        while(set.contains(i))
            i++;
        return i;
    }
}