class Tree
{
	public static int getSize(Node root)
	{
//add Code here.
        if(root == null )
            return 0;
        int count[]={0};
        helper(root,count);
        return count[0];
    }
    
    public static void helper(Node node, int []count){
        
        if(node == null)
            return;
            
        if(node.data > 0)
            count[0]++;
        helper(node.left,count);
        helper(node.right,count);
    }
}