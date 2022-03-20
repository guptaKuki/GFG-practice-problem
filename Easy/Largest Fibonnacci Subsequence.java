class Solution {
    
    public int[] findFibSubset(int arr[], int n)
    {
        int max=0;
        
        if( n==1)
            max=arr[0];
            
        for(int i=0;i<n;i++){
           max=Math.max(arr[i],max);
        }
    
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        int n1=0,n2=1,n3=0;
        while(n3<= max){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            fib.add(n3);
        }
        
        ArrayList<Integer> ans= new ArrayList<>();
        for(int j=0;j<n;j++){
           if(fib.contains(arr[j]))
                ans.add(arr[j]);
        }
        
        int []sub=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            sub[i]=ans.get(i);
        }
        
        return sub;
    }
}