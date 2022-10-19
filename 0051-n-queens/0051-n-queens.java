class Solution {
    public boolean isSafe(int row, int col,char board[][])
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]=='Q')
                return false;
        
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]=='Q')
                return false;
        
        }
        int r=row;
        for(int c=col;c>=0 && r>=0;r--,c--)
        {
            
            if(board[r][c]=='Q')
                return false;
        
        }
         r=row;
        for(int c=col;c<board.length && r>=0;c++,r--)
        {
            if(board[r][c]=='Q')
                return false;
        
        }
         r=row;
        for(int c=col;c>=0 && r<board.length;c--,r++)
        {
            if(board[r][c]=='Q')
                return false;
        
        }
         r=row;
        for(int c=col;c<board.length && r<board.length;c++,r++)
        {
            if(board[r][c]=='Q')
                return false;
        
        }
        return true;
    }
    
    public void helper(char board[][],List<List<String>> res,int col)
    {
       
        List<String> newBoard= new ArrayList<>();
        if(col==board.length)
        { 
        for(int i=0;i<board.length;i++)
        {
            String r="";
             for(int j=0;j<board[0].length;j++)
             {
                 if(board[i][j]=='Q')
                     r+='Q';
                     else
                         r+='.';
             }
            newBoard.add(r);
            
        }
        res.add(newBoard);
         return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(isSafe(row,col,board))
            {
                board[row][col]='Q';
                helper(board,res,col+1);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
     List<List<String>> res= new ArrayList<>();
        char board[][]= new char[n][n];
        helper(board,res,0);
        return res;
    }
}