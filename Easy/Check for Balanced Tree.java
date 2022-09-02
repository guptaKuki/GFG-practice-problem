class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	    if(root == null)
	        return true;
	        
	    int flag=isBalancedHelper(root);
	    if(flag == -1)
	        return false;
	    else
	        return true;
    }
    
    int isBalancedHelper(Node root){
        if(root == null)
            return 0;
            
        int left=isBalancedHelper(root.left);
        int right= isBalancedHelper(root.right);
        
        if(left == -1 || right == -1)
            return -1;
            
        if(Math.abs(left-right) > 1)
            return -1;
            
        return 1+ Math.max(left,right);
    }
}