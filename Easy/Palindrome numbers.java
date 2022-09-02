class Solution{
    static long isPallindrome(long N){
        // code here
        String str="";
        while(N > 0){
            if(N%2 == 0)
                str+="0";
            else
                str+="1";
            N=N/2;
        }
        
        long res=helper(str);
        return res;
    }
    
    static long helper(String str){
        for(int i=0 ,j =str.length()-1 ;i<j ;i++,j--){
            if(str.charAt(i) != str.charAt(j))
                return 0;
        }
        
        return 1;
    }
}