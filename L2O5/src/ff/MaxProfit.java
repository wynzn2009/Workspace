package ff;


public class MaxProfit {
	public int maxProfit(int[] prices) {
		if(prices.length==0){
			return 0;
		}
		int[] temp = new int[prices.length];
		temp[0] = 0;
		for(int i=0;i<prices.length-1;i++){
			temp[i+1] = prices[i+1]-prices[i];
		}
		int max1 = temp[0];
        int min1 = temp[0];
        int sum1 = temp[0];
        for(int i=1;i<temp.length;i++){
        	sum1 += temp[i]; 
        	if(sum1>max1||sum1 - min1>max1){
        		max1 = min1<0?sum1-min1:sum1;
        	}
        	if(sum1<min1){
        		min1 = sum1;
        	}
        }
		return max1;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
