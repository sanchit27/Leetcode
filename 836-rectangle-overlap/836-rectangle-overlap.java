class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
                
        int x1= rec1[0];
        int y1= rec1[1];
        int x2= rec1[2];
        int y2= rec1[3];
        
        int x3= rec2[0];
        int y3= rec2[1];
        int x4= rec2[2];
        int y4= rec2[3];
        
        if(rec1[0]<rec2[2] && rec1[1]<rec2[3] && rec1[2]>rec2[0] && rec1[3]>rec2[1])
            return true;
        
        return false;
}
}