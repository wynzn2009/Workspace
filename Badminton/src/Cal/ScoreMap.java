package Cal;

public class ScoreMap {
	private final int HIGH[]={8,7,6,5,4,3,2,2,1,1,0};
	private final int LOW[]={8,10,13,16,20,25,30,35,40,45,50};
	private double kk = 1.0;
	
	
	public double getKk() {
		return kk;
	}


	public void setKk(double kk) {
		this.kk = kk;
	}


	public int[] getHIGH() {
		return HIGH;
	}


	public int[] getLOW() {
		return LOW;
	}
	public int getHighScore(int diff){
		if(diff>=0&&diff<=12){
			return this.getHIGH()[0];
		}else if(diff>=13&&diff<=37){
			return this.getHIGH()[1];
		}else if(diff>=13&&diff<=37){
			return this.getHIGH()[2];
		}else if(diff>=38&&diff<=62){
			return this.getHIGH()[3];
		}else if(diff>=63&&diff<=87){
			return this.getHIGH()[4];
		}else if(diff>=88&&diff<=112){
			return this.getHIGH()[5];
		}else if(diff>=113&&diff<=137){
			return this.getHIGH()[6];
		}else if(diff>=138&&diff<=162){
			return this.getHIGH()[7];
		}else if(diff>=163&&diff<=187){
			return this.getHIGH()[8];
		}else if(diff>=188&&diff<=212){
			return this.getHIGH()[9];
		}else{
			return this.getHIGH()[10];
		} 
	}
	
	public int getlowScore(int diff){
		if(diff>=0&&diff<=12){
			return this.getLOW()[0];
		}else if(diff>=13&&diff<=37){
			return this.getLOW()[1];
		}else if(diff>=13&&diff<=37){
			return this.getLOW()[2];
		}else if(diff>=38&&diff<=62){
			return this.getLOW()[3];
		}else if(diff>=63&&diff<=87){
			return this.getLOW()[4];
		}else if(diff>=88&&diff<=112){
			return this.getLOW()[5];
		}else if(diff>=113&&diff<=137){
			return this.getLOW()[6];
		}else if(diff>=138&&diff<=162){
			return this.getLOW()[7];
		}else if(diff>=163&&diff<=187){
			return this.getLOW()[8];
		}else if(diff>=188&&diff<=212){
			return this.getLOW()[9];
		}else{
			return this.getLOW()[10];
		} 
	}

	public ScoreMap(double kk) {
		super();
		this.kk = kk;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreMap map = new ScoreMap(1.0);
		System.out.println(map.getHighScore(44));

	}

}
