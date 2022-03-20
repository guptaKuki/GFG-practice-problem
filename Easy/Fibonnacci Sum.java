//User function Template for Java
class Solution{
    static long fibSum(long N){
        //code here
        long n1=0;
        long n2=1;
        long n3=0,i=2;
        long sum=1;
        
         if(N==0)
            return 0; 
            
        while(i<=N){
            n3=(n1+n2)%1000000007;
            sum+=n3;
            n1=n2;
            n2=n3;
            i++;
        }
        return sum%1000000007;
    }
}