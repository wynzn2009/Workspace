package Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.Msg.MsgSimpleText;

public class TestPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 13020000201408010008
		//Pattern p = Pattern.compile("1302\\d{4}20\\d{2}[01]\\d[0123]\\d{5}");
		//Matcher m = p.matcher("bj13020000201408010008bj");
		Pattern p = Pattern.compile("dw\\d{0,2}");
		Matcher m = p.matcher("dw");
		if(m.find()){
			System.out.println(m.group());
			System.out.println("bj13020000201408010008bj".substring(2,22));
		}else{
			System.out.println("meiyou");
		}
		Map map = new HashMap();
		map.put("Content", "dw1");
		MsgSimpleText msg = new MsgSimpleText(map);
	}

}
