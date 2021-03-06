// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.awt.Point; 
import java.util.Arrays; 
import java.util.Vector; 
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    Integer arr[] = new Integer[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    Point p=new Solution().findRepeating(arr,n);
            
            System.out.println(p.x +" "+ p.y ); 
		    
		}
		
		
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find repeated element and its frequency.
    public static Point findRepeating(Integer arr[],int n)
    {
        //Your code here
        int low=0,high=arr.length-1;
       
      int count=0;
      count= arr.length-(arr[arr.length-1]-arr[low]);
      while(low<=high){
          int mid= (high+low)/2;
          if(arr[mid]==(arr[0]+mid)){
              low=mid+1;
          }
          else
              high=mid-1;
      }
      if(count>1)
       return new Point(arr[low], count);
       else
       return new Point(-1, -1);
    }  
};