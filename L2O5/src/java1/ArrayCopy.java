/**
 * 
 */
package java1;

import java.util.Arrays;

/**
 * @author LO
 *
 */
public class ArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = new int[4];
		//System.arraycopy(a, 2, b, 0, 4);
		b = Arrays.copyOf(a, 4);
		a[3] = 100;
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+"$$$");
		}
	}

}
