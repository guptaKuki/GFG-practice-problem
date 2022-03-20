// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static long nthFibonacci(long n){
        // code here
        long n1=1;
        long n2=1;
        long n3=0,i=3;
        if( n==1 || n==2)
            return 1;
        while(i<=n){
            n3=(n1+n2)%1000000007;
            n1=n2;
            n2=n3;
            i++;
        }
        return n2%1000000007;
    }
}