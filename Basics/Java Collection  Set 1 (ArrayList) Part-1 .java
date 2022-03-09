class Solution 
{ 
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
    { 
        // code here
       
        if(Q==1){
            int p=Query.get(0);
            int r=Query.get(1);
            
             A.add(p,r);
             return A;
        }else{
            // int index=-1;
            // for( int i=A.size()-1;i>=0;i--){
            //     if(A.get(i) == Query.get(0)){
            //          index=i;
            //          break;
            //     }
            
            ArrayList<Integer> ind= new ArrayList<>();
           ind.add(A.lastIndexOf(Query.get(0)));
            return ind;
        }
        
       
    }
}