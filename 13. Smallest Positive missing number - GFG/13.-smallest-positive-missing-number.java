// { Driver Code Starts
import java.util.*;


 // } Driver Code Ends


class Solution
{
    
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        for(int i=0;i<size;i++){
            int correctPos=arr[i]-1;
            while(arr[i]>0 && arr[i]<=size && arr[i]!=arr[correctPos]){
                swap(arr,i,correctPos);
                correctPos=arr[i]-1;
            }
        }
        for(int i=0;i<size;i++){
            if(i+1!=arr[i]){
                 return i+1;
            }
        }
        return size+1;
    }
}


// { Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}

  // } Driver Code Ends