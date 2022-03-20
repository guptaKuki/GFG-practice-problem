class Solution{
    int fibonacciDigits(long N){
        //code here
        long fib[]= new long[300];
         fib[0]=0;
         fib[1]=1;
        
        for(int i=2;i<300;i++){
            fib[i]=(fib[i-1]+fib[i-2])%100;
        }
        
        int s=(int)Math.abs(N%300);
            return (int)(fib[s]);
            
    }
}