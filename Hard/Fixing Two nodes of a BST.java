class Solution
{
  
    private Node first;
    private Node middle;
    private Node last;
    private Node prev;
    
    public void inorder(Node node){
        if(node == null)
            return;
        
        inorder(node.left);
        
        if(prev != null && node.data < prev.data){
            if(first == null){
                first=prev;
                middle=node;
            }else
                last=node;
        }
        prev=node;
        inorder(node.right);
    }
    
    //Function to fix a given BST where two nodes are swapped.  
    public Node correctBST(Node root)
    {
        //code here.
         if(root == null)
            return null;
        
        first=middle=last=null;
        prev=new Node(Integer.MIN_VALUE);
        
        inorder(root);
        if(first != null && last != null){
            int temp=first.data;
            first.data=last.data;
            last.data=temp;
        }
        if(first != null && last == null){
            int temp=first.data;
            first.data=middle.data;
            middle.data=temp;
        }  
        return  root;
    }
}