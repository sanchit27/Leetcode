class Solution {
    public void gameOfLife(int[][] board) {
        int start= board.length;
        int end=board[0].length;
        int[][] res= new int[start][end];
        //res=board;

        for(int i=0;i<start;i++)
        {
            for(int j=0;j<end;j++)
            {
                System.out.printf("Currently at %d, %d \n", i, j);
                int count=0;
                if(j-1>=0)
                {
                    //left
                    if(board[i][j-1]==1||board[i][j-1]==2)
                        count++;
                    System.out.println("left"+i+""+j);
                }
                if(i-1>=0)
                {
                    //top
                    if(board[i-1][j]==1||board[i-1][j]==2)
                        count++;
                    System.out.println("top"+i+""+j);
                }
                if( i+1<start)
                {
                    //down
                    if(board[i+1][j]==1||board[i+1][j]==2)
                        count++;
                    System.out.println("down"+i+""+j);
                }
                if(j+1<end)
                {
                    //right
                    if(board[i][j+1]==1||board[i][j+1]==2)
                        count++;
                    System.out.println("right"+i+""+j);
                }
                if(i-1>=0 && j-1>=0)
                {
                    //north west diagnol
                    if(board[i-1][j-1]==1||board[i-1][j-1]==2 )
                        count++;
                    System.out.println("NWD"+i+""+j);
                }
                if(i-1>=0 && j+1<end)
                {
                    //north east diagnol
                    if(board[i-1][j+1]==1||board[i-1][j+1]==2)
                        count++;
                    System.out.println("NED"+i+""+j);
                }
                if(i+1<start && j-1>=0)
                {
                    //south west diagnol
                    if(board[i+1][j-1]==1||board[i+1][j-1]==2)
                        count++;
                    System.out.println("SWD"+i+""+j);
                }
                if(i+1<start && j+1<end)
                {
                    //south east diagnol
                    if(board[i+1][j+1]==1||board[i+1][j+1]==2)
                        count++;
                    System.out.println("SED"+i+""+j);
                }
               
                if(board[i][j]==1){
                    if(count<2 || count>3)
                        //res[i][j]=1;
                    board[i][j]=2;
                }else{
                    if(count==3)
                        board[i][j]=3;
                }
              
            }
        }
        for(int i=0;i<start;i++)
        {
            for(int j=0;j<end;j++)
            {   System.out.print(res[i][j]);
             board[i][j]%=2;
            }
            System.out.println();
        }
   

       
    }
}