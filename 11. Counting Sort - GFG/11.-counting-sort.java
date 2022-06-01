// { Driver Code Starts
import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            String arr = "";
            arr = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.countSort(arr));
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        // code here
         int l = arr.length();
       int count[] = new int[26];
       for(int i=0;i<l;i++)
           count[(arr.charAt(i) - 'a')]++;
       for(int j=1;j<26;j++)
           count[j] += count[j - 1];
       
       char op[] = new char[l];
       for(int k=0;k<l;k++)
       {
           op[count[arr.charAt(k) - 'a'] - 1] = (char)arr.charAt(k);
           count[arr.charAt(k) - 'a']--;
       }
       return String.valueOf(op);   
    }
}