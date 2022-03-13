class GfG
{
    /*inserts an element x to the set s */
    void insert(Set<Integer> s, int x)
    {
	// Your code here
	s.add(x);
    }
	
    /*prints the contents of the set s in ascending order */
    void print_contents(Set<Integer> s)
    {
	// Your code here
	    TreeSet<Integer> sorted= new TreeSet<>(s);
	     Iterator it= sorted.iterator();
	     while(it.hasNext())
	        System.out.print(it.next()+" ");
    }
	
    /*erases an element x from the set s */	
    void erase(Set<Integer> s, int x)
    {
	// Your code here
	    s.remove(x);
    }
	
    /*returns the size of the set s */
    int size(Set<Integer> s)
    {
        // Your code here
        return s.size();
    }
		
    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(Set<Integer> s, int x)
    {
	// Your code here
	    if(s.contains(x))
	        return 1;
	   else
           return -1;
        
    }
}