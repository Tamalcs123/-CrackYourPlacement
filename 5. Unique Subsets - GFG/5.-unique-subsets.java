// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.print("()");
		    ArrayList <ArrayList<Integer>> res = new solve().AllSubsets(arr,n);
		    for (int i = 0; i < res.size (); i++)
		    {
		        System.out.print ("(");
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		            if (j != res.get(i).size()-1)
		                System.out.print ((res.get(i)).get(j) + " ");
		            else
		                System.out.print ((res.get(i)).get(j));
		        }
		        System.out.print (")");
		      
		    }
		    System.out.println();
		}
	}
}// } Driver Code Ends


class solve
{
    //Function to find all possible unique subsets.
      static ArrayList<ArrayList<Integer>> result;
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        // your code here
         Arrays.sort(arr);
        result = new ArrayList<ArrayList<Integer>>();
        traverse(arr, 0,new ArrayList<Integer>());
        return result;
    }
    static void traverse(int[] nums, int index, ArrayList<Integer> tmp){
        if(tmp.size() > 0)
            result.add((ArrayList)tmp.clone());
        if(index >= nums.length)
            return;
        for(int i = index; i < nums.length; i++){
            if(i > index && nums[i] == nums[i-1])
                continue;
            tmp.add(nums[i]);
            traverse(nums,i + 1,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
