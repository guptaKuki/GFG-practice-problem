class Solution {
    static char nthFibonacciDigit(long n){
        // code here
        long n1=0,n2=1,n3=0;
        String str="01";
        for(long i=0;i<n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            str=str+n2;
        }
        int l=(int)n;
        return str.charAt(l);
    }
}