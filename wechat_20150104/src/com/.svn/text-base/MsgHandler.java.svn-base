package com;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import Test.TestData;

import com.Msg.BaseMsg;
import com.Msg.MsgSimpleButton;
import com.Msg.MsgSimpleText;
import com.Msg.MsgXmlFormat;
/**
 * 用于消息的接收，分发处理，发送
 * */
public class MsgHandler {
	private Map msgMap;
	private Map dealtMap;
	private BaseMsg bm;
	private String xmlStr;
	public MsgHandler(InputStream is){
		try {
			//TestData.step = "MsgHandler跳转后";
			this.msgMap = this.ParseXML(is);
			TestData.step = (String)this.msgMap.get("ToUserName")+(String)this.msgMap.get("FromUserName")+(String)this.msgMap.get("MsgType")+(String)this.msgMap.get("Event")+(String)this.msgMap.get("EventKey");
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.excute();
	}
	private String getMsgType(){
		//TestData.step = "getMsgType";
		if(this.msgMap.containsKey("MsgType")){
			return (String)this.msgMap.get("MsgType");
		}
		return "";
	}
	/*public Map getMsgMap(){
		return this.msgMap==null?new HashMap():this.msgMap;
	}*/
	private Map ParseXML(InputStream is){
		try {
			XMLToMap xtm = new XMLToMap();
			this.msgMap = xtm.ParseXML(is);
			return this.msgMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new HashMap();
	}
	private void excute(){
		//从这里分流并得到处理结果，处理过程由各个class自己根据map内容处理
		try{
			if(this.getMsgType().equals("text")){
				bm = new MsgSimpleText(this.msgMap);
			}else if(this.getMsgType().equals("event")){
				bm = new MsgSimpleButton(this.msgMap);
			}
			/*else if(){
				bm = new xxx;
			}else{
			}*/			
			this.xmlStr = this.MapToXml(this.bm.getHandledMap());
		}catch(Exception e){
			this.xmlStr = "";
		}
		
	}
	public String getResult(){
		System.out.println("from MsgHandler getresult");
		return this.xmlStr==null?"":this.xmlStr;
	}
	private String MapToXml(Map map){
		String Str = "";
		String msgtype = "";
		String createTime = String.valueOf(System.currentTimeMillis()/1000);
		try{
			msgtype = (String)map.get("MsgType");
			if(msgtype.equals("text")){
				Str = MsgXmlFormat.SendSimpleText;
				Str = Str.replaceAll(MsgXmlFormat.createTime,createTime)
						.replaceAll(MsgXmlFormat.toUserName, (String)map.get("FromUserName"))
						.replaceAll(MsgXmlFormat.fromUserName,(String)map.get("ToUserName"))
						.replaceAll(MsgXmlFormat.content, (String)map.get("Content"));
				System.out.println("dealt FROM USER NAME "+(String)map.get("FromUserName")+",");
				System.out.println("xmlformat.tousername: "+MsgXmlFormat.toUserName+",");
			}
			else if(msgtype.equals("news")){
				Str = MsgXmlFormat.SendNewsMessage;
				Str = Str.replaceAll(MsgXmlFormat.createTime, createTime)
						.replaceAll(MsgXmlFormat.toUserName, (String)map.get("FromUserName"))
						.replaceAll(MsgXmlFormat.fromUserName, (String)map.get("ToUserName"))
						.replaceAll(MsgXmlFormat.articleCount, (String) map.get("ArticleCount"))
						.replaceAll(MsgXmlFormat.title, (String) map.get("Title"))
						.replaceAll(MsgXmlFormat.description, (String) map.get("Description"))
						.replaceAll(MsgXmlFormat.picUrl, (String) map.get("PicUrl"))
						.replaceAll(MsgXmlFormat.url, (String) map.get("Url"));
			}
		}catch(Exception e){
			System.out.println("when Map To Str cause err");
			Str = "";
		}
		return Str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("ToUserName", "gh_5763ce77f56d");
		map.put("FromUserName", "gh_5763ce77f56d");
		map.put("CreateTime", "12345");
		map.put("MsgType", "event");
		map.put("Event", "CLICK");
		map.put("EventKey", "Menu2_Click1");
		BaseMsg bm = new MsgSimpleButton(map);
	}
}