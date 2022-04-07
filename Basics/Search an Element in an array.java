class Solution{
        
    static int search(int arr[], int N, int X)
    {
        int index=-1;
        for( int i=0;i<N;i++){
            if(X == arr[i]){
                index=i;
                break;
            }
        }
        return index;
    }
    
}