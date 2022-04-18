class GfG
{
    public static int moduarNode(Node head, int k)
    {
        // add your code here
        if( head == null)
            return -1;
            
        Node tail=head;
        int i=1;
        int value=-1;
        while(tail != null){
            if(i%k == 0)
                value=tail.data;
            tail=tail.next;
            i++;
        }
        return value;
    }
}