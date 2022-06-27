// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	
    // 	int in[]=new int[n];
    // 	int out[]=new int[n];
    	
    // 	for(int i=0;i<n;i++){
    // 	    for(int j=0;j<n;j++){
    // 	        if(M[i][j]==1){
    // 	            in[j]++;
    // 	            out[i]++;
    // 	        }
    // 	    }
    // 	}
    // 	  for(int i=0;i<n;i++){
    // 	        if(in[i]==n-1 && out[i]==0){
    // 	            return i;
    // 	        }
    // 	    }
    // 	    return -1;
    
    int c=0;
    for(int i=1;i<n;i++){
        if(M[c][i]==1){
            c=i;
        }
    }
    for(int i=0;i<n;i++){
        if(i!=c && (M[c][i]==1 || M[i][c]==0) ){
            return -1;
        }
    }
    return c;
    }
}