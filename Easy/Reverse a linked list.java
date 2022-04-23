class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head == null || head.next == null)
            return head;
        
        Node newNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
}