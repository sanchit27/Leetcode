class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       
        int target = image[sr][sc];
        if(target == color){
            return image;
        }
        dfs(sr,sc,target,color,image);
        return image;
        
    }
    private void dfs(int row,int col,int target,int newColor,int[][] image){
        if(row < image.length && row >= 0 && col < image[0].length && col >= 0 && image[row][col] == target) {
            image[row][col] = newColor;
            int dRow[] = { -1, 0, 1, 0 };
            int dCol[] = { 0, 1, 0, -1 };
            for(int i=0;i<dRow.length;i++)
            {
                 dfs(row-dRow[i], col-dCol[i], target, newColor, image);
            }
           
        }
    }
}