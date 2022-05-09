class Solution
{
    //Function to calculate the span of stock’s price for all n days.
    public static int[] calculateSpan(int arr[], int n)
    {
       Stack<Integer> stack= new Stack<>();
		int result[]=new int[arr.length];
		
		stack.push(0);
		result[0]=1;
		for(int i=1;i<arr.length;i++) {
					while( !stack.isEmpty()&& arr[i]>=arr[stack.peek()]) {
						stack.pop();
					}
					if(stack.isEmpty())
						result[i]=i+1;
					else
						result[i]=i-stack.peek();
					stack.push(i);
		}
		return result;
    }
    
}