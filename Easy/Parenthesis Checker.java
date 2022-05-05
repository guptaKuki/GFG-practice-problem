class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String bracket)
    {
        // add your code here
        Stack<Character> stack=new Stack<>();
		for(int i=0;i<bracket.length();i++) {
			
			if(bracket.charAt(i) == '[' || bracket.charAt(i)=='{' || bracket.charAt(i)=='(') {
				stack.push(bracket.charAt(i));
				
			}else if (bracket.charAt(i) == ']' || bracket.charAt(i)=='}' || bracket.charAt(i)==')') {
				
				if(stack.isEmpty())
					return false;
				
					char ch=stack.pop();
					if(bracket.charAt(i)==')' && ch=='(')
						continue;
					else if(bracket.charAt(i)=='}' && ch=='{')
						continue;
					else if(bracket.charAt(i)==']' && ch=='[')
						continue;
					else
						return false;
			}
		}
		return stack.isEmpty();

    }
}