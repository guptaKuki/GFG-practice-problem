class Solution
{
	int countNonLeafNodes(Node root) {
	    //code here
	    if(root == null )
            return 0;
        int count[]={0};
        countHelper(root,count);
        return count[0];
	}
	
	void countHelper(Node node , int []count){
	    if(node == null)
	        return;
	        
	   if(node.left != null && node.right != null)
	        count[0]++;
	   
	   if(node.left != null && node.right == null)
	        count[0]++;
	        
	   if(node.left == null && node.right != null)
	        count[0]++;
	   
	   countHelper(node.left,count);
	   countHelper(node.right,count);
	}
}