package ff;

import java.util.Arrays;

public class MajorityElement {
	public static int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length/2];
    }
	public static int majorityElementVote(int[] num) {
		int a = num[0];
		int vote = 1;
		for(int i=1;i<num.length;i++){
			if(num[i]==a){
				vote ++;
			}else{
				vote --;
			}
			if(vote<0){
				vote = 1;
				a = num[i];
			}
		}
        return a;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1};
		MajorityElement.majorityElement(a);

	}

}
