class Solution {
    int binarysearch(int arr[], int n, int k){
        // code here
    int s=0,e=n-1;
    while(s<=e){
        int mid= (s+e)/2;
        
        if(k == arr[mid])
            return mid;
        if(k<arr[mid])
            e=mid-1;
        else
            s=mid+1;
    }
    return -1;
    }
}