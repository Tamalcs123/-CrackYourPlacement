// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Driverclass {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(new BlackAndWhite().numOfWays(N, M));
        }
    }
}// } Driver Code Ends



class BlackAndWhite
{
    //Function to find out the number of ways we can place a black and a 
    //white Knight on this chessboard such that they cannot attack each other.
    static long ans = 0;
    static long numOfWays(int N, int M)
    {
        // add your code here
       ans = 0;
        boolean[][] visited = new boolean[N+1][M+1];
        solve(0,0,N,M,visited);
        return ans%1000000007;
    }
     static void solve(int i, int j, int N, int M, boolean[][] visited){
        if(i==N && j==M){
            return;
        }
        if(visited[i][j]){
            return;
        }
        if(isSafe(i, j, N, M)){
            visited[i][j] = true;
            ans += count(i, j, N, M);
            solve(i+1, j, N, M, visited);
            solve(i, j+1, N, M, visited);
            solve(i+1, j+1, N, M, visited);
        }
        
    }
    
    static boolean isSafe(int i, int j, int N, int M){
        return (i>=0 && i<N && j>=0 && j<M);
    }
    
    static long count(int i, int j, int N, int M){
        int res = 0;
        if(i-1 >=0 && i-1<N && j-2>=0 && j-2<M){
            res++;
        }
        if(i+1 >=0 && i+1<N && j-2>=0 && j-2<M){
            res++;
        }
        if(i-1 >=0 && i-1<N && j+2>=0 && j+2<M){
            res++;
        }
        if(i+1 >=0 && i+1<N && j+2>=0 && j+2<M){
            res++;
        }
        
        if(i-2 >=0 && i-2<N && j-1>=0 && j-1<M){
            res++;
        }
        if(i+2 >=0 && i+2<N && j-1>=0 && j-1<M){
            res++;
        }
        if(i-2 >=0 && i-2<N && j+1>=0 && j+1<M){
            res++;
        }
        if(i+2 >=0 && i+2<N && j+1>=0 && j+1<M){
            res++;
        }
        return ((N*M)-res-1)%1000000007;
        
    }
}