class Solution{
	static long DifferOne(long a, long b){
      	long ans=a^b;
        
    	    long count=0;
         while(ans > 0){
             count+=ans & 1;
             ans>>=1;
         }
         if(count == 1)
             return 1;
         else
             return 0;
         if(ans != 0 && (ans&(ans-1))== 0)
             return 1;
     return 0;
   }
}