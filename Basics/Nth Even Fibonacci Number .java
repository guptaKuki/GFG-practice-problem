class Solution {
    static long nthEvenFibonacci(long n){
        // code here
         long  n1=0;
         long  n2=1,n3=0;
        int j=2;
        while(j<=(n*3)){
            n3=(n1+n2)%1000000007;
            n1=n2;
            n2=n3;
            j++;
        }
        return n2%1000000007;
    }
}