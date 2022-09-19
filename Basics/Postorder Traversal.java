class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
        ArrayList<Integer> al= new ArrayList<>();
        postorderHelper(root,al);
        return al;
    }
    
    void postorderHelper(Node node , ArrayList<Integer> al){
        if(node == null)
            return;
        
        postorderHelper(node.left , al);
        postorderHelper(node.right,al);
        al.add(node.data);
    }
}