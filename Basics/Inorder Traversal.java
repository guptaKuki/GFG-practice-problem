class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> al= new ArrayList<>();
        inorderHelper(root,al);
        return al;
    }
    
    void inorderHelper(Node node , ArrayList<Integer> al){
        if(node == null)
            return;
        
        inorderHelper(node.left , al);
        al.add(node.data);
        inorderHelper(node.right,al);
    }
}