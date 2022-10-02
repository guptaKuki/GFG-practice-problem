class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if( node == null)
            return;
            
        node=mirrorhelper(node);
        
    }
    Node mirrorhelper(Node node){
        
        if(node == null)
            return null;
        
       Node left=mirrorhelper(node.right);
       Node right=mirrorhelper(node.left);
       
       node.left=left;
       node.right=right;
       
       return node;
    }
}