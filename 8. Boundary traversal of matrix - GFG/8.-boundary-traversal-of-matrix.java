// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int matrix[][] = new int[n][m];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(matrix, n, m);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
          ArrayList<Integer> al = new ArrayList<Integer>();
       int rowBegin = 0 , rowEnd = n-1;
       int colBegin = 0 , colEnd = m-1;
       
       //Traversing First Row
       for(int i=colBegin; i<=colEnd; i++)
       {
           al.add(matrix[rowBegin][i]);
       }
       rowBegin++;
       
       //Traversing Last Column
       for(int i=rowBegin; i<=rowEnd; i++)
       {
           al.add(matrix[i][colEnd]);
       }
       colEnd--;
       
       if(rowBegin > rowEnd || colBegin > colEnd) return al;
       
       //Traversing Last Row
       for(int i=colEnd; i>=colBegin; i--)
       {
           al.add(matrix[rowEnd][i]);
       }
       rowEnd--;
       
       //Traversing First Column
       for(int i=rowEnd; i>=rowBegin; i--)
       {
           al.add(matrix[i][colBegin]);
       }
       colBegin++;
       return al;
    }
}
