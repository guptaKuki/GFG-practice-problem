class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	   // int prev=0;
	    Node tail=head;
	    while(tail.next != null){
	        if(tail.data == tail.next.data)
	            tail.next=tail.next.next;
	        else
	         tail=tail.next;
	    }
	    
	    return head;
    }
}