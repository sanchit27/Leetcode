class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closeSum = nums[0]+ nums[1]+nums[n-1];
        
        for(int i=0;i<n;i++){
            
        int l=i+1;
        int h=n-1;
        
            while(l<h){
                int currSum = nums[i]+nums[l]+nums[h];
                
                if(currSum<target){
                    l++;
                }
                else {
                    h--;
                }
                
                if(Math.abs(currSum-target)<Math.abs(closeSum-target)){
                    closeSum=currSum;
                }
            }
            
        }
        return closeSum;
    }
}