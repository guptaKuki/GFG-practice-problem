import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<Integer> ans=ob.nFibonacci(N);
            for(Integer u:ans)
             System.out.print(u+" ");
            System.out.println(); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList <Integer> nFibonacci(int N){
        //code here
        ArrayList<Integer> a=new ArrayList<>();
        int n1=0,n2=1,n3=0;
        a.add(n1);
        //a.add(n2);
        
        int i=0;
        while(n2<=N){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            a.add(n1);
            
        }
       return a;
        
    }
}