//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    static  ArrayList<String> res;
    static int[][] visited;
    public static void findPaths(int[][] m,int row,int col,String s,int n){
        if(row==n-1 && col==n-1){
           res.add(s);
           return;
        }
        else{
        visited[row][col]=1;
        }
         if(row+1<n && visited[row+1][col]==0 && m[row+1][col]==1){
            findPaths(m,row+1,col,s+"D",n);                         //DOWN
        }
         if(col-1>=0 && visited[row][col-1]==0 && m[row][col-1]==1){
            findPaths(m,row,col-1,s+"L",n);                     //LEFT
        }
         if(col+1<n && visited[row][col+1]==0 && m[row][col+1]==1){
            findPaths(m,row,col+1,s+"R",n);                   //RIGHT
        }
        if(row-1>=0 && visited[row-1][col]==0 && m[row-1][col]==1){
            findPaths(m,row-1,col,s+"U",n);                   //UP
        }
        visited[row][col]=0;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        visited = new int[n][n];
        res= new ArrayList<>();
        if(m[0][0]==0){
            return res;
        }
        String s="";
        findPaths(m,0,0,s,n);
        return res;
    }
}