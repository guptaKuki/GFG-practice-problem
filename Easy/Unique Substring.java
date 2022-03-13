class Solution{

        public static int unique_substring(String str)
    {
        //Your code here
        TreeSet<String> ts= new TreeSet<>();
        
        for( int i=0; i<str.length();i++){
            for( int j=i+1;j<=str.length();j++){
                String s=str.substring(i,j);
                ts.add(s);
            }
        }
        return ts.size();
    }
}