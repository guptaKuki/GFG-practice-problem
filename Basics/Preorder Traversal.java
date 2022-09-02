//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static void preorderlist(Node root , ArrayList<Integer>list){
        if(root == null)
            return;
        list.add(root.data);
        preorderlist(root.left , list);
        preorderlist(root.right, list);
    }
    
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> list= new ArrayList<>();
        preorderlist(root , list);
        return list;
    }

}