class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
            return image;
        
        fillcolor(image,sr,sc,image[sr][sc],color);
            return image;
        
    }
    public void fillcolor(int[][] image, int sr, int sc,int oldcolor, int color)
    {
        
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]!=oldcolor)
        { 
           
            return;
        }
        image[sr][sc]=color;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
       
        for(int i=0;i<drow.length;i++)
        { 
            fillcolor(image,sr-drow[i],sc-dcol[i],oldcolor,color);
        }
    }
}