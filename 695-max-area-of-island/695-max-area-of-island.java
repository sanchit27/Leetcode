class Solution {
     int di[]={0,-1,1,0};
        int dj[]={1,0,0,-1};
 
    public int findArea(int[][]grid, boolean[][] vis, int i,int j)
    {
           int m=grid.length;
    int n=grid[0].length;
        if(i>=m||j>=n||i<0||j<0)
            return 0;
        if(grid[i][j]==0 || vis[i][j])
            return 0;
        vis[i][j]=true;
        int ans=0;
        for(int d=0;d<4;d++)
        {
            ans+=findArea(grid,vis,i+di[d],j+dj[d]);
        }
        return ans+1;
    }
    public int maxAreaOfIsland(int[][] grid) {
       int m=grid.length;
        int n=grid[0].length;
        boolean vis[][]= new boolean[m][n];
        int ans=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==false)
                    ans=Math.max(ans,findArea(grid,vis,i,j)); 
            }
        }
       return ans; 
    }
 
}