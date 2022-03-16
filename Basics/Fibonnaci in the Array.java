class Solution 
{
    boolean check(long n){
        long n1=0,n2=1,n3=0;
            while(n3< n){
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            if( n3==n)
                return true;
            else
                return false;
    }
    int checkFib(long arr[] ,int N)
    {
        int count=0;
        for( int i=0;i<N;i++){
            boolean c=check(arr[i]);
            if(c){
                count++;
            }
        }
        return count;
    }
}