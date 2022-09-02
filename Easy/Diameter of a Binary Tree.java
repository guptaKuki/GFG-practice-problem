class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        if( root == null)
            return 0;
            
        int []maxi=new int[1];
        int height= diameterHelper(root, maxi);
        
        return maxi[0];
    }
    
    int diameterHelper(Node root , int []maxi){
        
        if(root == null)
            return 0;
        
        int left=diameterHelper(root.left ,maxi);
        int right=diameterHelper(root.right ,maxi);
        
        maxi[0]= Math.max(maxi[0] , 1+left+right);
        
        return 1+Math.max(left,right);
    }
}