class Solution
{
    
    static int searchInsertK(int arr[], int N, int k)
    {
        // code here
       
        int s=0,e=N-1,mid=0;
        while(s<=e){
            mid=(s+e)/2;
            if(arr[mid]>k)
                e=mid-1;
            else if(arr[mid]<k)
                s=mid+1;
            else
                return mid;
        }
        return s;
    }
}