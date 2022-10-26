class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high= nums.length-1;
        while(mid<=high)
        {
            int curVal=nums[mid];
            if(curVal==0)
            {
                nums[mid]=nums[low];
                mid++;
                nums[low]=curVal;
                low++;
            }else if(curVal==1)
            {
                mid++;
            }else
            {
                nums[mid]=nums[high];
                nums[high]=curVal;
                high--;
            }
        }
    }
}