package Cal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PrisRank {
	private ScoreMap scoreMap = new ScoreMap(1.0);
	private List<Player> players = new ArrayList<Player>();
	private List<Player> playersR = new ArrayList<Player>();
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private final String address = "E:\\Badminton\\Score2014";
	
	public List<Player> getPlayersR() {
		return playersR;
	}

	public void setPlayersR(List<Player> playersR) {
		this.playersR = playersR;
	}

	public ScoreMap getScoreMap() {
		return scoreMap;
	}

	public void setScoreMap(ScoreMap scoreMap) {
		this.scoreMap = scoreMap;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	public String getAddress() {
		return address;
	}
	
	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

	@SuppressWarnings({ })
	public void readRank(String date) throws IOException{
		String url = this.getAddress()+"\\"+date+".txt";
		File filename = new File(url);
		InputStreamReader reader = new InputStreamReader(new FileInputStream(filename));
		BufferedReader br = new BufferedReader(reader);
		String line = "";
		String datas[] = null;
		List<Player> list = new ArrayList<Player>();
		line = br.readLine();
		while(line!=null){
			System.out.println(line.toString());
			datas = line.split("--");
			Player p = new Player(datas[0],Integer.valueOf(datas[1]));
			this.map.put(datas[0],Integer.valueOf(datas[1]));
			list.add(p);
			line = br.readLine();
		}
		this.setPlayers(list);
	}
	public void writeRand(String date) throws IOException{
		String url = this.getAddress()+"\\"+date+".txt";
		File write = new File(url);
		if(write.exists()){
			System.out.println("Already exist! Warning!!");
			return;
		}
		BufferedWriter out = new BufferedWriter(new FileWriter(write));
		Iterator<Player> go = this.getPlayersR().iterator();
		while(go.hasNext()){
			Player p = go.next();
			String con = p.getName()+"--"+p.getScore()+"\r\n";
			out.write(con);
			go.remove();
		}
		out.flush();
		out.close();
	}
	public void updataScore(Match match){
		int win = 0;
		int lose = 0;
		for(String x : match.getTeamwin()){
			win = win + map.get(x);
		}
		win = win/match.getTeamwin().length;
		for(String x : match.getTeamlose()){
			lose = lose + map.get(x);
		}
		lose = lose/match.getTeamlose().length;
		for(String x : match.getTeamwin()){
			int diff = map.get(x)-win;
			int add = 0;
			if(diff<=0){
				add = this.scoreMap.getlowScore(Math.abs(diff));
			}else{
				add = this.scoreMap.getHighScore(diff);
			}
			map.put(x, map.get(x)+add);
			System.out.println(map.get(x)+"******"+x);
		}
		for(String x : match.getTeamlose()){
			int diff = map.get(x)-lose;
			int add = 0;
			if(diff<=0){
				add = this.scoreMap.getlowScore(Math.abs(diff));
			}else{
				add = this.scoreMap.getHighScore(diff);
			}
			map.put(x, map.get(x)-add);
			System.out.println(map.get(x)+"******"+x);
		}
	}
	@SuppressWarnings("unchecked")
	public void mapToList(){
		Iterator iter = this.getMap().entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) iter.next();
			Player p = new Player(entry.getKey(),entry.getValue());
			this.getPlayersR().add(p);
			iter.remove();
		}
	}
	public void addNewPlayer(String name){
		Player p = new Player(name,1000);
		if(this.players.contains(p)){
			System.out.println("Name used");
			return;
		}
		else{
			this.players.add(p);
			if(this.playersR.size()==this.players.size()&&this.players.size()>0){
				this.players.add(p);
			}
		}
	}
	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrisRank a = new PrisRank();
		try {
			a.readRank("20140713");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Match> list = new ArrayList();
		list.add(new Match(false,"ZMJ","LQJ","WY","YCY"));
		list.add(new Match(false,"WY","GRX","WYN","YCY"));
		list.add(new Match(false,"WY","GRX","XY","LQJ"));
		list.add(new Match(false,"WY","GRX","ZMJ","WDL"));
		list.add(new Match(false,"WY","GRX","WYN","YCY"));
		list.add(new Match(false,"WY","GRX","XY","LQJ"));
		list.add(new Match(false,"WY","GRX","ZMJ","WDL"));
		list.add(new Match(false,"WYN","YCY","WY","GRX"));
		list.add(new Match(false,"XY","LQJ","WYN","YCY"));
		list.add(new Match(false,"ZMJ","WDL","XY","LQJ"));
		list.add(new Match(false,"ZMJ","WDL","WY","GRX"));
		list.add(new Match(false,"WYN","YCY","ZMJ","WDL"));
		list.add(new Match(false,"XY","LQJ","WYN","YCY"));
		list.add(new Match(false,"WY","GRX","XY","LQJ"));
		list.add(new Match(false,"WY","GRX","ZMJ","WDL"));
		list.add(new Match(false,"WY","GRX","WYN","YCY"));
		list.add(new Match(false,"WY","GRX","XY","LQJ"));
		list.add(new Match(false,"WY","GRX","WYN","WDL"));
		for(Match m : list){
			a.updataScore(m);
		}
		a.mapToList();
		try {
			a.writeRand("20140720");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
