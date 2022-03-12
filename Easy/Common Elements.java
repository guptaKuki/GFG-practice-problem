class Solution{
    public static ArrayList<Integer> common_element(ArrayList<Integer>v1, ArrayList<Integer>v2)
    {
        //Your code here
        ArrayList<Integer> al= new ArrayList<>(v1);
        
        al.retainAll(v2);
        Collections.sort(al);
        return al;
    }
}