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
        if(row<0 || row>=matrix.length||col<0 || col>=matrix[0].length||matrix[row][col]!=letter[index]||visited[row][col])
            return false;
    
        
        visited[row][col]=true;
        //Main Cases
        
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        for(int i=0;i<drow.length;i++)
        {
       if(dfs(row-drow[i], col-dcol[i], index+1))
           return true;
        }
        
      
           visited[row][col] = false;

        return false;
    }
}