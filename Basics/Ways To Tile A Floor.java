class Solution {
    
    static Long numberOfWays(int N) {
        //code here
        long n1=1;
        long n2=2;
        if(N==1)
        return n1;
        if(N==2)
        return n2;
        
        long n3=0;
        int j=3;
        while( j <= N){
            n3=(n1+n2)%1000000007;
            n1=n2;
            n2=n3;
            j++;
        }
        
        return n2%1000000007;
        
    }
};