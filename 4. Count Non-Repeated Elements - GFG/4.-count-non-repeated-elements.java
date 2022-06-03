// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        
        while(t-- >0)
        {
            //taking total count of elements
            int n=sc.nextInt();
            
            //Declaring and Initializing an array of size n
            int arr[] = new int[n];
            
            //Inserting elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
            //calling countNonRepeated method
            //of class Hashing and printing the result
            System.out.println(new Solution().countNonRepeated(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: input array
    // n: size of array
    
    //Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int arr[], int n)
    {
        // add your code
               long count=0;
       
      HashMap<Integer,Integer> m=new HashMap<>();
      
     for (int i = 0; i < n; i++) 
     {
          if (m.containsKey(arr[i])) 
          {
              m.put(arr[i], m.get(arr[i]) + 1);
          }
          else
          {
              m.put(arr[i], 1);
          }
     }
     for (int i = 0; i < n; i++)
     {
          if (m.get(arr[i]) == 1)
              {
                  count++;
              }
     }
      return count;
    }
}