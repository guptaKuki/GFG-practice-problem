class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       Node tail= node;
       if( tail == null)
        return -1;
        
        int count=0;
        while(count <ind-1){
            tail=tail.next;
            count++;
        }
        return tail.data;
    }
}