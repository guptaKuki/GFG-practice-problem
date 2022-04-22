class Solution {
    //Function to check if the linked list has a loop.
    
    
    public static boolean detectLoop(Node head){
        // Add code here
        Node tail= head;
        Node temp=head;
        int flag=0;
        while(tail != null && temp != null && temp.next != null){
            tail=tail.next;
            temp=temp.next.next;
            if(tail == temp){
                flag=1;
                break;
            }
        }
        if( flag == 1)
            return true;
        else
            return false;
    }
}