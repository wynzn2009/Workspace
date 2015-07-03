package com.Msg;

public class PublicNetAddress {
	public static String url = "http://tangshanwx.duapp.com";
	
	//回复消息中带有链接的文本格式化在此
	public static String mutibjcx = "<a href=\"" +PublicNetAddress.url+"/yw/bjjdcx.jsp"+ "\">多条件查询</a>";
	//Regex1为序号1,2,3..；Regex2为局简称：工商局，从数据库中取的时候可以调用这个模板String
	public static String dwurl = "<a href=\"" +	PublicNetAddress.url +	"/yw/sxlb.jsp?dwNo=Regex1\">Regex2</a>";
	
	
}
