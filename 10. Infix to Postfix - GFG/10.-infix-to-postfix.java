// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) 
	{
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<exp.length(); i++){
		    
		    char ch = exp.charAt(i);
		    
		    if(Character.isLetterOrDigit(ch)){
		        result += ch;
		    }else if(ch == '('){
		        stack.push(ch);
		    }else if(ch == ')'){
		        while(!stack.isEmpty() && stack.peek() != '('){
		            result += stack.pop();
		        }
		        stack.pop();
		    }else{
		        while(!stack.isEmpty() 
		               && precedence(ch) <= precedence(stack.peek())
		               && isLeftToRightAssociative(ch)){
		            result += stack.pop();
		        }
		        stack.push(ch);
		    }
		}
		
		while(!stack.isEmpty()){
		    result += stack.pop();
		}
		
		return result;
	}
	
	private static int precedence(char ch){
	    if(ch == '+' || ch == '-')
	        return 1;
	    else if(ch == '*' || ch == '/')
	        return 2;
	    else if( ch == '^')
	        return 3;
	    else
	        return -1;
	}
	
	private static boolean isLeftToRightAssociative(char ch){
	    return ch != '^';
	}
}