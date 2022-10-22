class Solution {
    public void setZeroes(int[][] matrix) {
        boolean mat[][]=new boolean[matrix.length][matrix[0].length];
        boolean row= false;
        boolean col= false;
        
        for(int i=0;i<matrix.length;i++)
        {
                if(matrix[i][0]==0)
                {
                    
                    row=true;
                }  
        }
        for(int i=0;i<matrix[0].length;i++)
        {
                if(matrix[0][i]==0)
                {
                    col=true;
                }  
        }
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                     
                }
            }
        }
       
            for(int i=1;i<matrix.length;i++)
            {
                if(matrix[i][0]==0)
                {
                    for(int j=0;j<matrix[0].length;j++)
                        matrix[i][j]=0;
                     
                }
            }
        for(int i=1;i<matrix[0].length;i++)
            {
                if(matrix[0][i]==0)
                {
                    for(int j=0;j<matrix.length;j++)
                    { matrix[j][i]=0;
                     //System.out.println(i);
                     //System.out.println(j);
                     }
                     
                }
            }
        if(row)
        {
            System.out.println("row");
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }
         if(col)
        {
             System.out.println("col");
            for(int i=0;i<matrix[0].length;i++)
                matrix[0][i]=0;
        }
      
        
    }
}