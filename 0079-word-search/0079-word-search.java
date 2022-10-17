class Solution {
    public boolean exist(char[][] board, String word) {
       boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
             for(int j=0;j<board[0].length;j++)
                 if(board[i][j]==word.charAt(0))
                 {
                     
                      if(fill(board,i,j,word,0,visited))
                          return true;
                 }
        }
        return false;
     
       
    }
    public boolean fill(char[][] board,int sr,int sc, String word,int count,boolean[][] visited)
    {
        if(count==word.length())
            return true;
        if(sr<0||sc<0||sr>=board.length||sc>=board[sr].length||board[sr][sc]!=word.charAt(count)||visited[sr][sc])
            return false;
        
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        visited[sr][sc]=true;
        for(int i=0;i<drow.length;i++)
        {
            
            if(fill(board,sr-drow[i],sc-dcol[i],word,count+1,visited))
                return true;    
        }
        visited[sr][sc]=false;
        return false;
    }
}