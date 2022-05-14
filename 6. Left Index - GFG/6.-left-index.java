// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int sizeOfArray = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[]= new int[sizeOfArray];
            for(int i = 0; i < sizeOfArray; i++)
              arr[i] = Integer.parseInt(st[i]);
            
            int elementToSearch = Integer.parseInt(read.readLine());
            
            System.out.println(new LeftIndex().leftIndex(sizeOfArray, arr, elementToSearch));
        }
    }
}

// } Driver Code Ends


class LeftIndex{ 

    static int leftIndex(int N, int arr[], int X)
    {
       
       // Your code here
       int low=0;
       int high=N-1;
       int a=-1;
       while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]>X)
           high=mid-1;
           else if(arr[mid]<X)
           low=mid+1;
           else{
               if(mid==0 || arr[mid]!=arr[mid-1]){
                return mid;
               }
               else{
               high=mid-1;
               }
           }
       }
       return -1;
       
   
    }
}

