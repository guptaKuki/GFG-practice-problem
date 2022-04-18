
class GfG
{
    public static int length( Node head){
        Node temp=head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
       
        return count;
    }
    
    public static int nknode(Node head, int k)
    {
       // add your code here
       if(head == null || k<0)
        return -1;
        
       Node tail=head;
       int i=1;
       int n=length(head);
       
       double nk=(n*1.0)/k;
       int index=(int)Math.ceil(nk);
        
       
       while(i < index){
           tail=tail.next;
           i++;
       }
       int value=tail.data;
       return value;
       
    }
}