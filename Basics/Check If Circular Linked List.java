class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here
	    if( head == null)
	        return true;
	    Node tail=head;
	    while(true){
	        if(tail.next == head)
	            return true;
	        if(tail.next == null)
	            return false;
	       tail=tail.next;
	    }
    }
}