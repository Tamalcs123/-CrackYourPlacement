// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
           long count=0;
       HashMap<Integer,Integer> out=new HashMap<Integer,Integer>();
       int i=-1,sum=0;
       out.put(0,1);
       while(i<arr.length-1){
           i++;
           sum+=arr[i];
           if(out.containsKey(sum)){
               count+=out.get(sum);
               out.put(sum,out.get(sum)+1);
           }else{
               out.put(sum,1);
           }
       }
       return count;
    }
}