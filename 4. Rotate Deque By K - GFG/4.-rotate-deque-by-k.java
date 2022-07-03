// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking count of all testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		     //Declaring and Initializing an ArrayDeque
		     ArrayDeque<Integer> deque = new ArrayDeque<Integer>(); 
		     
		     //Taking the count of total elements
		     int n=sc.nextInt();
		    
		     //adding all the elements to ArrayDeque 
		     for(int i=0;i<n;i++)
		     {
		         int x=sc.nextInt();
		         deque.add(x);
		     }
		     
		     int rotateQuery, k;
		     
		     //Taking type of rotation
		     rotateQuery=sc.nextInt();
		     //number of rotations
		     k=sc.nextInt();
		     
		     //if rotation type is 1 we call the method right_Rotate_Deq_ByK
		    if(rotateQuery == 1)
		        right_Rotate_Deq_ByK(deque, n, k);
                
            else//else we call the method left_Rotate_Deq_ByK
                left_Rotate_Deq_ByK(deque, n, k);
            
            //printing all the elements of the ArrayDeque
            for(int itr:deque)
                System.out.print(itr+" ");
            System.out.println();
		}
	}
	
	
 // } Driver Code Ends
//User function Template for Java


//Function to rotate deque by k places in anti-clockwise direction.
public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    //Your code here
      while(k-- != 0)
       deque.offerLast(deque.pollFirst());
}

//Function to rotate deque by k places in clockwise direction.
public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    //Your code here
     while(k-- != 0)
       deque.offerFirst(deque.pollLast());
}

// { Driver Code Starts.


}  // } Driver Code Ends