class Solution {
    
    public int lengthofList(Node head){
        Node node=head;
        int count=0;
        while(node != null){
            count++;
            node= node.next;
        }
        return count+1;
    }
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        int length=lengthofList(head);
        int mid= length/2;
        Node tail=head;
        Node temp= new Node(data);
        int count=0;
        while(count < mid-1){
            tail=tail.next;
            count++;
        }
        temp.next=tail.next;
        tail.next=temp;
        return head;
    }
}