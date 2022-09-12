class Solution {
    char[][] matrix;
    char[] letter;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int row= board.length;
        int col=board[0].length;
        letter=word.toCharArray();
        matrix=board;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==letter[0])
                {
                    visited= new boolean[row][col];
                    boolean res=dfs(i,j,0);
                    if(res==true)
                        return true;
                    
                }
                
            }
        }
        return false;
        
    }
    private boolean dfs(int row, int col, int index )
    {
        //Base cases
        if(index==letter.length)
            return true;
        if(row<0 || row>=matrix.length)
            return false;
         if(col<0 || col>=matrix[0].length)
            return false;
        if(matrix[row][col]!=letter[index])
            return false;
        if(visited[row][col] == true) return false;
        
        visited[row][col]=true;
        //Main Cases
        boolean top=dfs(row-1, col, index+1);
        boolean down=dfs(row+1, col, index+1);
        boolean right=dfs(row, col+1, index+1);
        boolean left=dfs(row, col-1, index+1);
        
        boolean ans= top||down||left||right;
        if(ans == false){
            visited[row][col] = false;
        }
        return ans;
    }
}


