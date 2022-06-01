// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    long x = Long.parseLong(br.readLine().trim());
		    System.out.println(new Solution().closer(arr, n, x));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
  
    // n: size of array
    // x: element to find
    //Function to find index of element x in the array if it is present.
    static long closer(int arr[], int n, long x)
    {
        // add your code here
        return binarySearch(arr,0,n-1,x);
    }
     public static long binarySearch(int arr[], int low, int high ,long x)
      {
           
            while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==x)
            {
            return mid;
            }
            else if(arr[mid] >x && arr[mid+1]>x)
            {
            high=mid-1;
            }
            else 
            low=mid+1;
        }
        return -1;
      }
}