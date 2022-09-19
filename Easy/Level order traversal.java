/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> ans= new ArrayList<>();
        if(node == null)
            return ans;

        Queue<Node> que= new LinkedList<Node>();
        que.offer(node);
        while(!que.isEmpty()){
            int size=que.size();
            while(size-- > 0){
                Node help= que.poll();
                ans.add(help.data);
                if(help.left != null)
                    que.offer(help.left);
                if(help.right != null)
                    que.offer(help.right);
            }
        }
        return ans;
    }
}