// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;

class Driverclass
{
	public static void main (String[] args)
	 {
    	 Scanner sc=new Scanner(System.in);
    	 int t=sc.nextInt();
    	 while(t-->0)
    	 {
    	        int n = sc.nextInt();
    		    int arr[] = new int[n];
    		    for(int i=0;i<n;i++)
    		    {
    		        arr[i] = sc.nextInt();
    		    }
    		    int sum = sc.nextInt();
    		    System.out.println(new Solution().subArraySum(arr, n, sum));
    		    
    		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int n, int sum)
    {
        // add your code here
       int ctr=0;
    HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
    int prefix_sum = 0;
    for(int num:arr){
        prefix_sum += num;
        if(prefix_sum==sum)
ctr++;
        if(hm.containsKey(prefix_sum-sum))
            ctr+=hm.get(prefix_sum-sum);
        if(hm.containsKey(prefix_sum))
            hm.put(prefix_sum, hm.get(prefix_sum)+1);
        else
            hm.put(prefix_sum, 1);
    }
    return ctr;
    }
}