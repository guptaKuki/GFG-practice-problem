class Solution {
    
    public int length(Node head){
        Node node=head;
        int l=0;
        while(node != null){
            l++;
            node=node.next;
        }
        return l;
    }
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      int count=0;
      int length=length(head);
      int sum=0;
      
      Node tail=head;
      while( tail != null){
          if(count >(length-k-1)){
              sum=sum+tail.data;
          }
          tail=tail.next;
          count++;
    }
    return sum;
}
}