// { Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int k = sc.nextInt();
                    String str = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.findMaximumNum(str, k));
                }
        }
}// } Driver Code Ends




class Solution
{
    //Function to find the largest number after k swaps.
       static void solve(char[] arr,int k){
        if(k==0) return;
        String tmp ="";
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
        for(int j = i+1;j<n;j++){
            if(arr[i]<arr[j]){
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                String str = String.valueOf(arr);
                if(str.compareTo(Max)>0){
                    Max = str;
                }
                solve(arr,k-1);
                 c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
            }
        }
        }
        
    }
    static String Max = "";
    public static String findMaximumNum(String str, int k)
        {
            //code here.
             Max = "";
            char[] arr = str.toCharArray();
           solve(arr,k);
            if(Max.length()==0) return str;
            
            return Max;
        }
}