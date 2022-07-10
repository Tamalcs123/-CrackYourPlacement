// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            
            int matrix[][] = new int[n1][m1];
            
            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    matrix[i][j] = sc.nextInt();

            Solution ob = new Solution();
            ob.reverseCol(matrix);

            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][])
    {
        // code here 
          for(int i=0;i<matrix.length;i++){
           int left = 0;
           int right = matrix[i].length-1;
           while(left<=right){
               int temp=matrix[i][left];
               matrix[i][left]=matrix[i][right];
               matrix[i][right]=temp;
               left++;
               right--;
           }
       }
    }
}
