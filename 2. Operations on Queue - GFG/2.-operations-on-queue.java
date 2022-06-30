// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG { 
    
    public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int inputN = inputLine.length;
		    Solution ob = new Solution();
		    Queue<Integer> q = new LinkedList<>();
		    try{
    		    for(int i=0, k=0; i<n; i++){
    		        if(inputLine[k].equals("i")){
    		            k++;
    		            ob.enqueue(q, Integer.parseInt(inputLine[k]));
    		            k++;
    		        }
    		        if(inputLine[k].equals("h")){
    		            k++;
    		            System.out.println (ob.front(q));
    		        }
    		        if(inputLine[k].equals("r")){
    		            k++;
    		            ob.dequeue(q);
    		        }
    		        if(inputLine[k].equals("f")){
    		            k++;
    		            System.out.println(ob.find(q, Integer.parseInt(inputLine[k])));
    		            k++;
    		        }
    		        if(k==inputN)break;
    		    }
		    } catch (ArrayIndexOutOfBoundsException ex){
		        continue;
		    }
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution {
    
    //Function to push an element in queue.
    void enqueue(Queue<Integer> q, int x){
        // Code here
         q.offer(x);
    }
    
    //Function to remove front element from queue.
    void dequeue(Queue<Integer> q){
        // code here
         q.poll();
    }
    
    //Function to find the front element of queue.
    int front(Queue<Integer> q){
        // Code here
        return q.peek();
    }
    
    //Function to find an element in the queue.
    String find(Queue<Integer> q, int x){
        // Code here
        for(Integer i:q){
            if(x==i)
            return "Yes";
            
        }
        return "No";
       
    }
}