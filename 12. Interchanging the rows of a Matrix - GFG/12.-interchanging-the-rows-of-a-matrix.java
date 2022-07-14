// { Driver Code Starts
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
            ob.interchangeRows(matrix);

            for(int i = 0; i < n1; i++)
                for(int j = 0; j < m1; j++)
                    System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][])
    {
        // code here 
      int row=matrix.length;
      int col=matrix[0].length;
      
      for(int i=0;i<(row/2);i++){
          for(int j=0;j<col;j++){
              int temp=matrix[i][j];
              matrix[i][j]=matrix[row-1-i][j];
              matrix[row-1-i][j]=temp;
          }
      }
    }
}
