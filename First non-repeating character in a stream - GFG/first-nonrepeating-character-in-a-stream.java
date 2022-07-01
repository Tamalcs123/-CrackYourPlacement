// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String s)
    {
        // code here
     if(s=="")
         return "";
      int a[]=new int[26];
      String res="";
      Queue<Character> q=new LinkedList<>();
      
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
           a[ch-'a']++;
          if(a[ch-'a']==1)
           q.add(ch);
           
           while(q.size()!=0 && a[q.peek()-'a']>1)
           {
               q.poll();
           }
           if(q.isEmpty())
           res+='#';
           else
           res+=q.peek();
      }
      return res;
    }
}