package ff;

public class Rotate1 {
	public static void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        while(i<n/2){
        	while(j<n-i-1){
        		int a = i;
        		int b = j;
        		int temp = matrix[i][j];
        		for(int q=0;q<4;q++){
        			int t = a;
        			a = b;
        			b = (n-1)-t;
        			t = temp;
        			temp = matrix[a][b];
        			matrix[a][b] = t;
        		}
        		j++;
        	}
        	i++;
        	j = i;
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{3,4}};
		Rotate1.rotate(matrix);
	}

}
