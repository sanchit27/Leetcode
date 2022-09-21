class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int hc=horizontalCuts.length;
        int vc=verticalCuts.length;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long val=1000000000+7;
        
        
        int len=Math.max(horizontalCuts[0]-0,h-horizontalCuts[hc-1]);
        int wid=Math.max(verticalCuts[0]-0,w-verticalCuts[vc-1]);
        
        for(int i=1;i<hc;i++)
        {
            len=Math.max(len,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        
         for(int i=1;i<vc;i++)
        {
            wid=Math.max(wid,verticalCuts[i]-verticalCuts[i-1]);
        }
        
        long area= 1l*len*wid;
        
        return (int)(area%val);
    }
}