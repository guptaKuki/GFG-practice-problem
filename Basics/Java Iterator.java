class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
         ArrayList<Integer> al= new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
         
        Iterator<Integer> it= al.iterator();
        
        while(it.hasNext()){
            if(it.next()<k)
                it.remove();
        }
        Collections.sort(al);
        return al;
    }
};