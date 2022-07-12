// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
             int matrix[][] = new int[n][n];
            String str[] = read.readLine().trim().split("\\s+");
            int k =0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  matrix[i][j] = Integer.parseInt(str[k++]);
            }
            Solution ob = new Solution();
            System.out.println(ob.findMinOperation(matrix,n));
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to find minimum number of operations that are required 
    //to make the matrix beautiful.
    static int findMinOperation(int matrix[][], int n)
    {
        // code here 
        int matSum = 0;
       int maxSum = 0;
       int fakeMaxSum = 0;
       for(int i = 0 ; i< n; i++){
           int fakeSum = 0;
           int fakeSum2 = 0;
           for(int j = 0 ; j< n; j++){
               matSum += matrix[i][j];
               fakeSum += matrix[i][j];
               fakeSum2 += matrix[j][i];
           }
           fakeMaxSum = Math.max(fakeSum ,fakeSum2); 
           maxSum = Math.max(maxSum , fakeMaxSum);
       }
       return n*maxSum - matSum ; 
    }
}