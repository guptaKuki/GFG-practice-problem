class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        ArrayList<Integer> result=new ArrayList<>(n);
        int i=0,j=1,count=k;
           while(i<n){
               if(count>n)
                    count=n;
                List<Integer> sub=arr.subList(i,count);
                 Collections.reverse(sub);
                 result.addAll(sub);
                 i=count;
                 j++;
                 count=k*j;
            }
            arr=result;
    }
}