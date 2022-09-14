class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int [] remainder = new int[60];
        for(int songTime: time)
        {
            int rem= songTime%60;
            remainder[rem]++;
        }
        int ans=0;
        for(int i=1;i<30;i++)
        {
            ans+= remainder[i]*remainder[60-i];
        }
        if(remainder[0]>0)
        {
            if(remainder[0]%2==0)
            ans+= ((remainder[0]/2)*(remainder[0]-1));
            else
                ans+= ((remainder[0])*(remainder[0]-1))/2;
        }
        if(remainder[30]>0)
        {
            ans+= (remainder[30]*(remainder[30]-1))/2;
        }
        return ans;
}
}