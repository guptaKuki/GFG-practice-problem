class Solution
{
    static void linkdelete(Node head, int m, int n)
    {
        // your code here
        //corner cases
		if( m==0 || head == null) {
			return ;
		}
		if(n == 0)
			return;
		
		Node temp1=head , temp2=null;
		
		while(temp1 != null ) {
			int c1=1 , c2=1;
			
			while(temp1 != null && c1<m) {
				temp1=temp1.next;
				c1++;
			}
			if(temp1 == null)
			    return;
			    
			    temp2=temp1.next;
			    
			while(c2<=n && temp2 != null) {
				temp2=temp2.next;
				c2++;
			}
		        temp1.next=temp2;
				temp1=temp2;
		}
			
    }
}