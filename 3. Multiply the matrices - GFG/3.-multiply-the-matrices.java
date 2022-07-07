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
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            
            int A[][] = new int[n1][m1];
            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    A[i][j] = sc.nextInt();

            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            int B[][] = new int[n2][m2];
            for(int i = 0; i < n2; i++)
                for(int j = 0; j < m2; j++)
                    B[i][j] =sc.nextInt();

            Solution ob = new Solution();
            int ans[][] = ob.multiplyMatrix(A,B);
            if(ans.length == 0)
                System.out.println(-1);
            else
            {
                for(int i = 0; i < ans.length; i++)
                for(int j = 0; j < ans[0].length; j++)
                    System.out.print(ans[i][j] +" "); 
                System.out.println();
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to multiply two matrices.
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        // code here 
          int n1=A.length;
       int n2=B.length;
       int m1=A[0].length;
       int m2=B[0].length;
       if(m1!=n2){
           return new int[0][0];
       }
       int [][]r=new int[n1][m2];
       for(int i=0;i<n1;i++){
           for(int j=0;j<m2;j++){
               for(int k=0;k<m1;k++){
                   r[i][j]+=A[i][k]*B[k][j];
               }
           }
       }
       return r;
    }
}