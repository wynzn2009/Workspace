package com.Msg;

public final class MsgXmlFormat {
	//这些是用于替代的字符串
	public static String toUserName = "ABab";
	public static String fromUserName = "ACac";
	public static String createTime = "ADad";
	public static String content = "AEae";
	public static String msgid = "AFaf";
	public static String event = "AGag";
	public static String eventkey = "AHah";
	public static String articleCount = "AIai";
	public static String articles = "AJaj";
	public static String title = "AKak";
	public static String description = "ALal";
	public static String picUrl = "AMam";
	public static String url = "ANan";
	
	public static String SendSimpleText = "<xml>" +
			"<ToUserName><![CDATA[ABab]]></ToUserName>" +
			"<FromUserName><![CDATA[ACac]]></FromUserName>" +
			"<CreateTime>ADad</CreateTime>" +
			"<MsgType><![CDATA[text]]></MsgType>" +
			"<Content><![CDATA[AEae]]></Content>" +
			"</xml>";
	public static String RecSimpleText = "<xml>" +
			"<ToUserName><![CDATA[ABab]]></ToUserName>" +
			"<FromUserName><![CDATA[ACac]]></FromUserName>" +
			"<CreateTime>ADad</CreateTime>" +
			"<MsgType><![CDATA[text]]></MsgType>" +
			"<Content><![CDATA[AEae]]></Content>" +
			"<MsgId>AFaf</MsgId>" +
			"</xml>";
	public static String RecMenuEvent ="<xml>" +
			"<ToUserName><![CDATA[ABab]]></ToUserName>" +
			"<FromUserName><![CDATA[ACac]]></FromUserName>" +
			"<CreateTime>ADad</CreateTime>" +
			"<MsgType><![CDATA[event]]></MsgType>" +
			"<Event><![CDATA[AGag]]></Event>" +
			"<EventKey><![CDATA[AHah]]></EventKey>" +
			"</xml>";
	public static String SendNewsMessage ="<xml>" +
			"<ToUserName><![CDATA[ABab]]></ToUserName>" +
			"<FromUserName><![CDATA[ACac]]></FromUserName>" +
			"<CreateTime>ADad</CreateTime>" +
			"<MsgType><![CDATA[news]]></MsgType>" +
			"<ArticleCount><![CDATA[AIai]]></ArticleCount>"+
			"<Articles>"+
			"<item>"+
			"<Title><![CDATA[AKak]]></Title>"+
			"<Description><![CDATA[ALal]]></Description>"+
			"<PicUrl><![CDATA[AMam]]></PicUrl>"+
			"<Url><![CDATA[ANan]]></Url>"+
			"</item>" +
			"</Articles>"+
			"<FuncFlag>1</FuncFlag>" +
			"</xml>";
	
	}
