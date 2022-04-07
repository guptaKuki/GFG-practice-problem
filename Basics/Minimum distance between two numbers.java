class Solution {
    int minDist(int arr[], int n, int x, int y) {
        // code here
        int p=-1,min_dis=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(x == arr[i] || y == arr[i]){
                if(p != -1 && arr[i] != arr[p])
                    min_dis=Math.min(min_dis,i-p);
                p=i;
            }
        }
        if(min_dis == Integer.MAX_VALUE)
            return -1;
        else
            return min_dis;
        }
    }