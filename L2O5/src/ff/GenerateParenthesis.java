package ff;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        this.generate(list, "", 0, 0, n);
        return list;
    }
	public void generate(List<String>list,String t,int left,int right,int n){
		if(left == n){
			for(int i=0;i<n-right;i++){
				t +=")";
			}
			list.add(t);
			return;
		}
		this.generate(list,t+"(",left+1,right,n);
		if(left>right){
			this.generate(list,t+")",left,right+1,n);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
