class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head == null )
            return 0;
        int sum[]={0};
        helper(head,sum);
        return sum[0];
    }

    static void helper(Node node, int []sum){
        
        if(node == null)
            return;
            
        if(node.data > 0)
            sum[0]+=node.data;
        helper(node.left,sum);
        helper(node.right,sum);
    }
}