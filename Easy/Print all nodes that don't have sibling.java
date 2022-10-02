class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        
        if(node == null)
            return al;
        noSiblingHelper(node,al);
        if(al.size()== 0){
            al.add(-1);
            return al;
        }
        Collections.sort(al);
        
        return al;
    }
    
     void noSiblingHelper(Node node , ArrayList<Integer> ans){
        
        if(node == null)
            return ;
            
        if(node.left != null && node.right != null){
            noSiblingHelper(node.left,ans);
            noSiblingHelper(node.right,ans);
        }else if(node.left != null){
            ans.add(node.left.data);
            noSiblingHelper(node.left,ans);
        }else if(node.right != null){
            ans.add(node.right.data);
            noSiblingHelper(node.right,ans);
        }
     }
}