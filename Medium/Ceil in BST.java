class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int ceil[]= new int[1];
        ceil[0]=-1;
        findceilhelper(root,key,ceil);
        return ceil[0];
    }
    
    void findceilhelper(Node root , int key , int ceil[]){
        
        if(root == null)
            return;
            
        if(root.data == key){
            ceil[0]=key;
            return;
        }
        
        if(root.data > key){
                ceil[0]=root.data;
           findceilhelper(root.left ,key,ceil);
        }else{
            
             findceilhelper(root.right,key,ceil);
        }
    }
}