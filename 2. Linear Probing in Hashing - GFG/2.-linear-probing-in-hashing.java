// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        
        while(t-- >0)
        {
            int hash_size = sc.nextInt();
            int array_size = sc.nextInt();
            
            int arr[] = new int[array_size];
            for(int i = 0; i < array_size; i++)
             arr[i] = sc.nextInt();
             
            // int hash_table[] = new int[hash_size];
            // for(int i = 0; i < hash_size; i++)
            //     hash_table[i] = -1;
            Solution obj = new Solution();
            int hash_table[] = obj.linearProbing(hash_size, arr, array_size);
            
            for(int i = 0; i <hash_size; i++)
                System.out.print(hash_table[i] + " ");
             
            System.out.println();
             
        }
    }
    
}// } Driver Code Ends


class Solution{
    //Function to fill the array elements into a hash table 
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        //Your code here
         int []table = new int[hash_size];
        
        for(int i=0;i<hash_size;i++){
            table[i] = -1;
        }
        
        int key = 0;
        for(int i=0;i<sizeOfArray;i++){
            key = arr[i] % hash_size;
            if(table[key] == arr[i]){
                continue;
            }
            
            if(table[key] == -1){
                table[key] = arr[i];
            }
            else{
                int k = 1;
                int j = (key+k) % hash_size;
                while(table[j] != -1){
                    if(j == key){
                        return table;
                    }
                    if(table[j] == arr[i]){
                        break;
                    }
                    else{
                        k++;
                        j = (key+k) % hash_size;
                    }
                }
                table[j] = arr[i];
            }
        }
        return table;
    }
}