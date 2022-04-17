/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        if(head == null)
            return ;
            
        Node tail=head;
        while(tail != null ){
           if(tail.next == null)
                return;
            tail.next=tail.next.next;
            tail=tail.next;
        }
    }
}