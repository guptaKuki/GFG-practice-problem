/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node temp=new Node(x);
        if(head == null)
        return temp;
        
        temp.next=head;
        return temp;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp=new Node(x);
        Node tail =head;
        
        if( head == null)
        return temp;
        
        while( tail.next != null){
            tail=tail.next;
        }
        tail.next=temp;
       return head; 
    }
}