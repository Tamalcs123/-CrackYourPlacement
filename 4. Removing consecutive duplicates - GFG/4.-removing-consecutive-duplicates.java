// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//taking the length of the string
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //taking the string
		   String str = br.readLine().trim();
		   
		   //calling removeConsecutiveDuplicates method of class solve
		   System.out.println(new Solution().removeConsecutiveDuplicates(str));
		}
	}
}// } Driver Code Ends




class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        // Your code here
            Stack<Character> st=new Stack<>();
       st.push(str.charAt(str.length()-1));
       for(int j=str.length()-1;j>=0;j--)
       {
           char x=str.charAt(j);
           if(st.isEmpty()==false && st.peek()!=x)
           st.push(x);
           else
           continue;
       }
       String s=""; 
       while(st.isEmpty()==false)
       {
           char c=st.pop();
           String temp=Character.toString(c);
           s+=temp;
       }
       return s;
    }
}