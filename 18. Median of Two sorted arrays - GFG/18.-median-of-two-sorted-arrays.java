// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n,m;
		    n=sc.nextInt();
		    m=sc.nextInt();
		    
		    int arr[]=new int[n];
		    int brr[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<m;i++)
		    {
		        brr[i]=sc.nextInt();
		    }
		    
		     if(n < m)
	        System.out.println(new Solution().findMedian(arr, n, brr, m));
	         else
	        System.out.println(new Solution().findMedian(brr, m, arr, n));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
        //Your code here\
      int low = 0,high = n;
      while(low<=high)
      {
          int i1 = (low+high)/2;
          int i2 = (n+m+1)/2 -i1;
          int max1 ,min1,max2 ,min2 ;
          
         if(i1==0) max1 = Integer.MIN_VALUE;
         else max1 = arr[i1-1];
         
         if(i2==0) max2 = Integer.MIN_VALUE;
         else max2 = brr[i2-1];
         
         if(i1==n) min1 =  Integer.MAX_VALUE;
         else min1 = arr[i1];
         
         if(i2==m) min2 = Integer.MAX_VALUE;
         else min2 = brr[i2];
         
         if(max1<=min2 && max2<=min1)
         {
             if((n+m)%2==0)
             return (Math.max(max1,max2)+Math.min(min1,min2))/2;
             else
             return Math.max(max1,max2);
         }
         if(max1>min2)  high = i1-1;
         if(max2>min1)   low = i1+1;
      }
      return -1;
    }
}