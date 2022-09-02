class Solution
{
     Node head= null;
	 Node tail=null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
    	if(root == null)
	        return null;
	    if(root.left == null && root.right == null)
	        return new Node(root.data);
	    
	    
	    BtoDLLhelper(root);
	 
	 return head;
    }
    
    public void BtoDLLhelper(Node root ){
        
        if(root == null)
            return ;
        
        BtoDLLhelper(root.left );
            
        if(head == null){
            head= root;
            tail=root;
            tail.left=null;
        }else{
            tail.right=root;
            tail.right.left=tail;
            tail=tail.right;
        }
        
        BtoDLLhelper(root.right );
    }
}