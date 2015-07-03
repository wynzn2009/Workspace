package Test;

import java.util.HashMap;
import java.util.Map;

import com.XMLToMap;

public class testxml {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        XMLToMap x=new XMLToMap();
        String xml="<xml>" +
		"<ToUserName><![CDATA[ABab]]></ToUserName>" +
		"<FromUserName><![CDATA[ACac]]></FromUserName>" +
		"<CreateTime>ADad</CreateTime>" +
		"<MsgType><![CDATA[text]]></MsgType>" +
		"<Content><![CDATA[AEae]]></Content>" +
		"</xml>";
        
        Map h=new HashMap();
        h=x.ParseXML(xml);
        System.out.println(h.get("Content"));
        
	}

}
