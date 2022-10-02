class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(n>0 && n%2==0)
        {
            double val=myPow(x,n/2);
            return val*val;
            
        }
        if(n>0 && n%2==1)
        {
            double val=myPow(x,n/2);
            return val*val*x;
            
        }
        if(n<0 && n%2==-1)
        {
            double val=myPow(x,-(n/2));
            System.out.println(val);
            return 1/(x*val*val);    
        }
        if(n<0 && n%2==0)
        {
            int pos= -n;
            double val=myPow(x,-(n/2));
            return 1/(val*val);    
        }
        return 0;
    }
}