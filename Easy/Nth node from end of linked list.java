class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	int l=0;
    	Node temp=head;
    	while(temp != null){
    	    l++;
    	    temp = temp.next;
    	}
    	Node tail=head;
    	
    	if(l < n)
    	    return -1;
    	    
    	while(l > n){
    	    tail=tail.next;
    	    l--;
    	}
    	    
    	return tail.data;
    }
}