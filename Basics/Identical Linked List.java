class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        Node tail1=head1;
        Node tail2= head2;
        
        if( head1 == null && head2 == null)
            return true;
        while(tail1 != null && tail2 != null){
            if(tail1.data != tail2.data)
                return false;
            tail1=tail1.next;
            tail2=tail2.next;
        }
        if(tail1 != null)
            return false;
        if( tail2 != null)
            return false;
    return true;
    }
}