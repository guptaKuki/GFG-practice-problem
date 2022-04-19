
class Solution {
    public static Node partition(Node node, int x) {
        // Your code here
        ArrayList<Integer> ll=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        Node tail=node;
        
         while(tail != null){
             ll.add(tail.data);
             tail=tail.next;
         }
       
         int n=ll.size();
         for(int i=0;i<n;i++){
             if(ll.get(i) < x)
                result.add(ll.get(i));
         }
      
         
          for(int j=0;j<n;j++){
             if(ll.get(j) == x)
                result.add(ll.get(j));
         }

         for(int k=0;k<n;k++){
             if(ll.get(k) > x)
                result.add(ll.get(k));
         }
       
         Node ans=new Node(result.get(0));
         Node newNode=ans;
         
         for(int l=1;l<n;l++){
             newNode.next=new Node(result.get(l));
             newNode=newNode.next;
         }
         return ans;
    }
}