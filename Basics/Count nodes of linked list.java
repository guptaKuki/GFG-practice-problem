/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        if( head == null)
            return 0;
            
        Node tail=head;
        int count=0;
        while(tail != null){
            count++;
            tail=tail.next;
        }
        return count;
    }
}