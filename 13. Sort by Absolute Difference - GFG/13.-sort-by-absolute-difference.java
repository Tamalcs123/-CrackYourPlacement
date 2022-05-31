// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int x = Integer.parseInt(inputLine[1]);
		    
		    int arr[] =  new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    new Solution().sortABS(arr,n, x);
		    StringBuilder sb = new StringBuilder();
		    for(int y : arr)
		        sb.append(y+ " ");
		    System.out.println(sb.toString());
		    
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to sort the array according to difference with given number.
    static void sortABS(int arr[], int n,int k)
    {
        // add your code here
        mergeSort(arr,0,n-1,k);
    }
    static void  merge(int a[],int l,int m,int r,int k)
    {
        int n1=m-l+1;
        int n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        left[i]=a[l+i];
        for(int i=0;i<n2;i++)
        right[i]=a[m+i+1];
        int i=0,j=0;
        int v=l;
        while(i<n1 && j<n2)
        {
            int leftabs=Math.abs(left[i]-k);
            int rightabs=Math.abs(right[j]-k);
            if(leftabs<=rightabs)
             a[v++]=left[i++];
             else
             a[v++]=right[j++];
        }
        while(i<n1)
        a[v++]=left[i++];
        while(j<n2)
        a[v++]=right[j++];
    }
    
    static  void mergeSort(int a[],int l,int r,int k)
    {
        if(r>l)
        {
            int m=l+(r-l)/2;
            mergeSort(a,l,m,k);
            mergeSort(a,m+1,r,k);
            merge(a,l,m,r,k);
        }
    }
}
