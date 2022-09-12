class Solution {
  
    char[][] matrix;
    char[] letters;
    boolean [][]visited;
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        letters=word.toCharArray();
        matrix=board;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==letters[0])
                {
                   visited =new boolean[row][col];
                    boolean res=dfs(i,j,0);
                    if(res==true)
                        return true;
                }
            }
        }
       return false;
        
    }
    
    public boolean dfs(int row,int col, int index)
    {
        if(index==letters.length)
            return true;
        if(row<0 || row>=matrix.length)
            return false;
        if(col<0 || col>=matrix[0].length)
            return false;
        if(matrix[row][col]!=letters[index])
            return false;
        if(visited[row][col] == true)
            return false;
        
        visited[row][col]=true;
        
        //Main Cases
        
        boolean right = dfs(row,col+1,index+1);
        boolean left = dfs(row,col-1,index+1);
        boolean top = dfs(row-1,col,index+1);
        boolean down = dfs(row+1,col,index+1);
        
        boolean ans= top || down || right || left;
        if(ans!=true)
        {
            visited[row][col]=false;
        }
        return ans;
        
        
    }
}



