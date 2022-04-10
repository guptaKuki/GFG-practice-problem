class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
        long res=1;
        for( int i=0;i<n;i++){
            res= (res*arr[i]) % mod;
        }
        return res ;
    }
}