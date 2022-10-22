class Solution {
    public void setZeroes(int[][] matrix) {
        int mat[][]=new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {mat[i][j]=1;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    for(int row = 0; row < matrix.length; ++row)
                         matrix[row][j] = 0;
                     for(int col = 0; col < matrix[0].length; ++col)
                         matrix[i][col] = 0;
                     
                }
            }
        }
      
        
    }
}