class Tree
{
    int countLeaves(Node node) 
    {
         // Your code 
         int count[]={0};
         
         countHelper(node,count);
         
         return count[0];
    }
    
    void countHelper(Node node , int []count){
        if(node == null)
            return ;
            
        if(node.left == null && node.right==null)
            count[0]++;
        
        countHelper(node.left,count);
        countHelper(node.right,count);
    }
}