package ff;

import java.util.Stack;

public class IsValid {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();  
		char []q = s.toCharArray();
		for(int i=0;i<q.length;i++){
			if('{'==q[i]||'['==q[i]||'('==q[i]){
				stack.push(q[i]);
			}else{
				if(stack.isEmpty()){
					return false;
				}else if(Math.abs(q[i]-stack.pop())>2){
					return false;
				}
			}
		}
		if(!stack.isEmpty()){
			return false;
		}
		return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()[]{}";
		IsValid.isValid(s);
	}

}
