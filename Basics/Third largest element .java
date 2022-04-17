class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int arr[]= new int[n];
	    
	    int fm=a[0];
	    int sm=-1;
	    int tm=-1;
	    for( int i=1;i<n;i++){
	        if(fm < a[i]){
	            tm=sm;
	            sm=fm;
	            fm=a[i];
	        }
	        else if(sm<a[i] && fm>a[i]){
	            tm=sm;
	            sm=a[i];
	        }else{
	            if(tm<a[i])
	               tm=a[i];
	        }
	    }
	    return tm;
	    
    }
}