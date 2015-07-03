package ff;

public class ClimbStairs {
	public int climbStairs(int n) {
        int temp = 0;
        int oneStep = 1;
        int twoSteps = 2;
        if(1==n){
        	temp = 1;
        }
        if(2==n){
        	temp = 2;
        }
        while(n>2){
        	temp = oneStep + twoSteps;
        	oneStep = twoSteps;
        	twoSteps = temp;
        	n--;
        }
		return temp;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
