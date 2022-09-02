public static Node post_order(int pre[], int size) 
{
    //Your code here
    if(size == 0)
     return null;
     
    Node ans=helper(pre,Integer.MAX_VALUE ,new int[]{0});
    return ans;
} 

public static Node helper(int pre[] , int bound ,int[] i){
    
   if(pre.length == i[0] || pre[i[0]] > bound)
    return null;
    
    Node root=new Node(pre[i[0]++]);
    root.left=helper(pre,root.data,i);
    root.right=helper(pre,bound,i);
    
    return root;

}