class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node tail=head;
         int count=0;
         while(tail != null){
             count++;
             tail=tail.next;
         }
         int mid=count/2;
         //if(mid % 2!=0)
         Node temp=head;
           while(mid > 0){
               temp=temp.next;
               mid--;
           } 
           return temp.data;
         
    }
}