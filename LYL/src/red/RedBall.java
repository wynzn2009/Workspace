/**
 * 
 */
package red;

/**
 * @author LO
 *
 */
public class RedBall {
	
	
	
	
	
	public static  int setRedBall(int m,int n,int k){
		if(m*k<n){
			return 0;
		}
		if(m*k==n){
			return 1;
		}
		
		if(n<k){
			return (int) Math.pow(m, n);
		}
		
		int u = 0;
		while(k>0){
			u += RedBall.setRedBall(m-1, n-k, k);
			k--;
		}
		return m*u;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = RedBall.setRedBall(3, 3, 3);
		System.out.println(a);
	}

}
