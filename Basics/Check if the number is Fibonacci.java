class Solution{
    
    static String checkFibonacci(int N){
        // code here
        int n1=0;
        int n2=1,n3=0;
        String check="No";
        int j=0;
        while(j<N){
            n3=n2+n1;
            n1=n2;
            n2=n3;
            if( n2==N){
                check="Yes";
                break;
            }
            j++;
        }
        return check;
    }
}