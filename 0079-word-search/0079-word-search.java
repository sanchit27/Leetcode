class Solution {
     int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
    public boolean exist(char[][] board, String word) {
        boolean[][] visited=new boolean[board.length][board[0].length];;
    
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    visited= new boolean[board.length][board[0].length];
                    boolean res=dfs(i,j,0,word,board,visited);
                    if(res==true)
                        return true;
                    
                }
                
            }
        }
        return false;
        
    }
    private boolean dfs(int row, int col, int index, String word,char[][] board,boolean[][] visited)
    {
        //Base cases
        if(index==word.length())
            return true;
        if(row<0 || row>=board.length||col<0 || col>=board[0].length||board[row][col]!=word.charAt(index)||visited[row][col])
            return false;
    
        
        visited[row][col]=true;
        //Main Cases
        
       
        for(int i=0;i<drow.length;i++)
        {
       if(dfs(row-drow[i], col-dcol[i], index+1,word,board,visited))
           return true;
        }
        
      
           visited[row][col] = false;

        return false;
    }
}