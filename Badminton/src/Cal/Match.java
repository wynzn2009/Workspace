package Cal;

public class Match {
	private boolean single = false;
	private String teamwin[] = null;
	private String teamlose[] = null;
	
	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

	public String[] getTeamwin() {
		return teamwin;
	}

	public void setTeamwin(String[] teamwin) {
		this.teamwin = teamwin;
	}

	public String[] getTeamlose() {
		return teamlose;
	}

	public void setTeamlose(String[] teamlose) {
		this.teamlose = teamlose;
	}
	
	
	public Match(boolean single, String teamwin1,String teamwin2, String teamlose1,String teamlose2) {
		super();
		String aa[] = {teamwin1,teamwin2};
		String bb[] = {teamlose1,teamlose2};
		this.single = single;
		this.teamwin = aa;
		this.teamlose = bb;
	}
	public Match(boolean single, String win,String lose){
		super();
		String aa[] = {win};
		String bb[] = {lose};
		this.single = single;
		this.teamwin = aa;
		this.teamlose = bb;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
