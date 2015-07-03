package ff;

public class MaxProfit2 {
	public static int maxProfit(int[] prices) {
        int n =0;
        int s = 0;
        boolean t = false;
		for(int i=0;i<prices.length-1;i++){
			if(prices[i]>=prices[i+1]){
				if(t){
					n = n + prices[i]-prices[s];
					t = false;
				}
				s=i+1;
			}else{
				t = true;
			}
		}
		if(t){
			n = n + prices[prices.length-1] - prices[s];
		}
		return n;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {1,2,4};
		int a = MaxProfit2.maxProfit(b);
		System.out.println(a);
	}

}
