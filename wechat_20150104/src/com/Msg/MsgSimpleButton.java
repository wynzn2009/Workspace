package com.Msg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.mail.Session;
import javax.servlet.ServletContext;

import Test.TestData;

import com.ApplicationContextUtils;
import com.wechat.vo.Dw;
import com.wechat.dao.DwDAO;
import com.wechat.service.DwService;
import com.wechat.service.NewsSaveService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * button消息的处理 
 */
public class MsgSimpleButton extends BaseMsg{
	private Map msgMap;
	private String event;
	private String eventKey;
	private Map dealtMap;
	
	
	public MsgSimpleButton(Map map){
	//	TestData.step = "跳入simpleButton";
		this.msgMap = map;
		if(this.msgMap.containsKey("Event")){
			TestData.step = "containsKeyEvent";
			this.event = ((String)this.msgMap.get("Event"));
			this.eventKey = ((String)this.msgMap.get("EventKey"));
			//TestData.step = "msgSimpleButton";
		}else{
			//TestData.step = "不包含Event关键词";
			this.event = "";
			this.eventKey = "";
		}
		this.excute();
	}
	private WebApplicationContext getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	public Map getHandledMap(){
		System.out.println("from msgsimpletext msg"); 
		return this.dealtMap;
	}
	protected void excute(){
		//TestData.step = "SimpleButtonExcute";
		String type = this.filterTaskByEvent(this.event);
		this.dealtMap = this.excuteTask(type);
	}
	/**
	 * 用于分析Event事件类型:CLICK VIEW
	 * @return String TaskType
	 */
	private String filterTaskByEvent(String content){
		if("CLICK".equals(content)){
			//TestData.step = "filterTaskByEvent";
			return "CLICK";
		}else if("VIEW".equals(content)){
			//do some Statistical work, such as record the view time
			return "VIEW";
		}
		return "CLICK";
	}
	
	
	/**
	 * 根据不同的业务类型，调用不同的业务方法进行处理，返回处理字符串
	 * @param type
	 * @return String result
	 */
	private Map excuteTask(String type){
		Map result=new HashMap();
		if(type.equals("CLICK")){
			//菜单1-按钮1：查询办件进度
			if(this.eventKey.equals("Menu1_Click1")){
				result = excuteMenu1Click1();
				TestData.step = "click Menu1_Click1";
				return result;
			}
			if(this.eventKey.equals("Menu1_Click2")){
				result = excuteMenu1Click2();
				return result;
			}
			if(this.eventKey.equals("Menu1_Click3")){
				result = excuteMenu1Click3();
				return result;
			}
			if(this.eventKey.equals("Menu2_Click1")){
				result = excuteMenu2Click1();
				return result;
			}
			if(this.eventKey.equals("Menu2_Click2")){
				result = excuteMenu2Click2();
				return result;
			}
			if(this.eventKey.equals("Menu3_Click1")){
				result = excuteMenu3Click1();
				return result;
			}
			if(this.eventKey.equals("Menu3_Click2")){
				result = excuteMenu3Click2();
				return result;
			}
			if(this.eventKey.equals("Menu3_Click3")){
				result = excuteMenu3Click3();
				return result;
			}
			String con = "欢迎关注唐山市政务服务中心公众账号！"+(this.eventKey==null?"":this.eventKey);
			result.put("ToUserName", this.msgMap.get("ToUserName"));
			result.put("FromUserName", this.msgMap.get("FromUserName"));
			result.put("CreateTime", this.msgMap.get("CreateTime"));
			result.put("MsgType", "text");
			result.put("Content", con);	
		}
		return result;
	}
	/**
	 * 执行菜单1，点击事件1功能
	 */
	private Map excuteMenu1Click1(){
		Map map = new HashMap();
		String con = "请输入\"bj+您的办件流水号\"进行查询\n如：bj13020000201408010008，\n若您忘记办件流水号，请点击链接:\n" +
				"<a href=\"" +PublicNetAddress.url+"/yw/bjjdcx.jsp"+ "\">多条件查询</a>进入";
		map.put("ToUserName", this.msgMap.get("ToUserName"));
		map.put("FromUserName", this.msgMap.get("FromUserName"));
		map.put("CreateTime", this.msgMap.get("CreateTime"));
		map.put("MsgType", "text");
		map.put("Content", con);	
		return map;
	}
	/**
	 * 执行菜单1，点击事件2功能
	 */
	private Map excuteMenu1Click2(){
		Map map = new HashMap();
	//	String appendPath = "servlet/sxSearch?pageIndex=1&perPage=10";
		String con = "您可以输入局名称如\'工商局\'进行查询，也可以点击下述单位列表名称进行查询。\n" +
				"单位列表：\n" +
				"1：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=安监局\">安监局</a>\n" +
				"2：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=城管局\">城管局</a>\n" +
				"3：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=住建局\">住建局</a>\n" +
				"4：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=财政局\">财政局</a>\n" +
				"5：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=发改委\">发改委</a>\n" +
				"6：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=法制办\">法制办</a>\n" +
				"7：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=公安局\">公安局</a>\n" +
				"8：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=工信局\">工信局</a>\n" +
				"点击这里查询更多单位信息:\n" +
				"<a href=\"" +	PublicNetAddress.url +	"/yw/bmsx.jsp\">大厅部门事项</a>\n";
		map.put("ToUserName", this.msgMap.get("ToUserName"));
		map.put("FromUserName", this.msgMap.get("FromUserName"));
		map.put("CreateTime", this.msgMap.get("CreateTime"));
		map.put("MsgType", "text");
		map.put("Content", con);	
		return map;
	}
	/**
	 * 执行菜单1，点击事件3功能
	 */
	private Map excuteMenu1Click3(){
		Map map = new HashMap();
		String con = "进行在线投诉，请点击如下链接\n" +
				"（注：在投诉的过程中，请务必记住您填写的验证码和投诉完成后生成的投诉办件流水号，方便今后进行投诉反馈查询）\n" +
				"<a href=\"" +	PublicNetAddress.url +	"/yw/xjts.jsp?dwNo=1\">在线投诉</a>\n" +
						"查看投诉反馈，请点击如下链接\n" +
						"（注：发起投诉后，您可以在12小时后对投诉办件的反馈情况进行查询）\n" +
						"<a href=\"" +	PublicNetAddress.url +	"/yw/tsfk.jsp?dwNo=1\">投诉反馈</a>\n"; 
		map.put("ToUserName", this.msgMap.get("ToUserName"));
		map.put("FromUserName", this.msgMap.get("FromUserName"));
		map.put("CreateTime", this.msgMap.get("CreateTime"));
		map.put("MsgType", "text");
		map.put("Content", con);	
		return map;
	}
	/**
	 * 执行菜单2，点击事件1功能
	 */
	private Map excuteMenu2Click1(){
		ApplicationContext ctxx = ApplicationContextUtils.getApplicationContext();
		Map map = new HashMap();
		NewsSaveService nService = (NewsSaveService)ctxx.getBean("NewsSaveService");
		
		String articles = "<item>" +
				"<Title><![CDATA[title1]]></Title>" +
				"<Description><![CDATA[description1]]></Description>" +
			    "<PicUrl><![CDATA[http://imnana.duapp.com/img/heart.png]]></PicUrl>" +
				"<Url><![CDATA[http://tangshanwx.duapp.com/yw/hdym.jsp]]></Url></item>" +
				"<item>" +
			    "<Title><![CDATA[title2]]></Title>" +
				"<Description><![CDATA[description2]]></Description>" +
				"<PicUrl><![CDATA[http://imnana.duapp.com/img/heart.png]]></PicUrl>" +
				"<Url><![CDATA[http://tangshanwx.duapp.com/yw/hdym.jsp]]></Url></item>";
		
		String title = nService.findByFbbzType(true, 0).get(0).getTitle();
		String des = nService.findByFbbzType(true, 0).get(0).getAuthor();
		String pic = nService.findByFbbzType(true, 0).get(0).getCover();
		//TestData.step = "title" +title + "des" +des;
	//	String title = "新闻中心";
	//	String des = "7月11日，市政府特邀咨询辛志纯带领市环保局、城管局、住建局、公安局等部门负责同志，就大气污染防治工作赴路南区、南湖区域检查督导。";
			
		//String picUrl = "http://tangshanwx.duapp.com/images/leader.jpg";
		String picUrl = PublicNetAddress.url + pic;
		String url = "http://tangshanwx.duapp.com/yw/xwzx.jsp";
		
		map.put("ToUserName", this.msgMap.get("ToUserName"));
		map.put("FromUserName", this.msgMap.get("FromUserName"));
		map.put("CreateTime", this.msgMap.get("CreateTime"));
		map.put("MsgType", "news");
		map.put("ArticleCount", "1");
		map.put("Articles", articles);
		map.put("Title", title);
		map.put("Description", des);
		map.put("PicUrl", picUrl);
		map.put("Url", url);
		map.put("FuncFlag", "1");
		return map;
	}
	/**
	 * 执行菜单2，点击事件2功能
	 */
	private Map excuteMenu2Click2(){
		ApplicationContext ctxx = ApplicationContextUtils.getApplicationContext();
		Map map = new HashMap();
		NewsSaveService nService = (NewsSaveService)ctxx.getBean("NewsSaveService");
		
		String articles = "<item>" +
				"<Title><![CDATA[title1]]></Title>" +
				"<Description><![CDATA[description1]]></Description>" +
			    "<PicUrl><![CDATA[http://imnana.duapp.com/img/heart.png]]></PicUrl>" +
				"<Url><![CDATA[http://tangshanwx.duapp.com/yw/hdym.jsp]]></Url></item>" +
				"<item>" +
			    "<Title><![CDATA[title2]]></Title>" +
				"<Description><![CDATA[description2]]></Description>" +
				"<PicUrl><![CDATA[http://imnana.duapp.com/img/heart.png]]></PicUrl>" +
				"<Url><![CDATA[http://tangshanwx.duapp.com/yw/hdym.jsp]]></Url></item>";
		
		String title = nService.findByFbbzType(true, 1).get(0).getTitle();
		String des = nService.findByFbbzType(true, 1).get(0).getAuthor();
		String pic = nService.findByFbbzType(true, 1).get(0).getCover();
		//String title = "重要公告";
		//String des = "公告内容点击链接查看详情";
		//String picUrl = "http://tangshanwx.duapp.com/images/leader.jpg";
		
		String picUrl = PublicNetAddress.url + pic;
		String url = "http://tangshanwx.duapp.com/yw/zygg.jsp";
		map.put("ToUserName", this.msgMap.get("ToUserName"));
		map.put("FromUserName", this.msgMap.get("FromUserName"));
		map.put("CreateTime", this.msgMap.get("CreateTime"));
		map.put("MsgType", "news");
		map.put("ArticleCount", "1");
		map.put("Articles", articles);
		map.put("Title", title);
		map.put("Description", des);
		map.put("PicUrl", picUrl);
		map.put("Url", url);
		map.put("FuncFlag", "1");
		return map;
	}
	/**
	 * 执行菜单3，点击事件1功能
	 */
	private Map excuteMenu3Click1(){
		ApplicationContext ctx = ApplicationContextUtils.getApplicationContext();
		
		Map map = new HashMap();
		DwService ds =  (DwService)ctx.getBean("DwService");
		NewsSaveService nss = (NewsSaveService)ctx.getBean("NewsSaveService");
		String tel1 = (ds.findByDwname("财政局").getDwtelphone() == null ||ds.findByDwname("财政局").getDwtelphone() == "") ? "暂未录入" : ds.findByDwname("财政局").getDwtelphone();
		String tel2 = ((ds.findByDwcode("13020000GA").get(0).getDwtelphone() == null) || ("".equals(ds.findByDwcode("13020000GA").get(0).getDwtelphone())) )? "暂未录入" : ds.findByDwcode("13020000GA").get(0).getDwtelphone();
		String tel3 = (ds.findByDwname("城乡规划局").getDwtelphone() == null || "".equals(ds.findByDwname("城乡规划局").getDwtelphone())) ? "暂未录入" : ds.findByDwname("城乡规划局").getDwtelphone();
		
		String con = nss.findByFbbz(true).getAuthor() +
				"以下为进驻唐山市政府办事大厅的各单位联系电话：\n" +
					"财政局：" + tel1 +"\n"+
					"公安局："+ tel2+"\n" +
					"城乡规划局："+ tel3+"\n" +
					"更多部门电话请点击<a href=\"" +	PublicNetAddress.url +	"/yw/lxdh.jsp\">单位联系电话</a>";
		map.put("ToUserName", this.msgMap.get("ToUserName"));
		map.put("FromUserName", this.msgMap.get("FromUserName"));
		map.put("CreateTime", this.msgMap.get("CreateTime"));
		map.put("MsgType", "text");
		map.put("Content", con);
		return map;
	}
	/**
	 * 执行菜单3，点击事件2功能
	 */
	private Map excuteMenu3Click2(){
		Map map = new HashMap();
		String con = "下面列出了唐山市政府的所有单位\n" +
				"财政局  公安局  教育局\n" +
				"农牧局  科技局  民政局\n" +
				"物价局  旅游局\n" +
				"或点击下面链接查看所有单位详细介绍：\n" +
				"<a href=\"" +	PublicNetAddress.url +	"/yw/bmxq.jsp\">部门介绍</a>";
		map.put("ToUserName", this.msgMap.get("ToUserName"));
		map.put("FromUserName", this.msgMap.get("FromUserName"));
		map.put("CreateTime", this.msgMap.get("CreateTime"));
		map.put("MsgType", "text");
		map.put("Content", con);	
		return map;
	}
	/**
	 * 执行菜单3，点击事件3功能
	 */
	private Map excuteMenu3Click3(){
		Map map = new HashMap();
		
		String articles = "<item>" +
				"<Title><![CDATA[title1]]></Title>" +
				"<Description><![CDATA[description1]]></Description>" +
			    "<PicUrl><![CDATA[http://imnana.duapp.com/img/heart.png]]></PicUrl>" +
				"<Url><![CDATA[http://tangshanwx.duapp.com/yw/hdym.jsp]]></Url></item>" +
				"<item>" +
			    "<Title><![CDATA[title2]]></Title>" +
				"<Description><![CDATA[description2]]></Description>" +
				"<PicUrl><![CDATA[http://imnana.duapp.com/img/heart.png]]></PicUrl>" +
				"<Url><![CDATA[http://tangshanwx.duapp.com/yw/hdym.jsp]]></Url></item>";
		String title = "大厅导航";
		String des = "唐山市行政服务大厅地址：新华西道122号   电话：(0315)2737852";
		String picUrl = "http://tangshanwx.duapp.com/images/lobbyMap.jpg";
		String url = "http://tangshanwx.duapp.com/yw/lobbyNavi.jsp";
		map.put("ToUserName", this.msgMap.get("ToUserName"));
		map.put("FromUserName", this.msgMap.get("FromUserName"));
		map.put("CreateTime", this.msgMap.get("CreateTime"));
		map.put("MsgType", "news");
		map.put("ArticleCount", "1");
		map.put("Articles", articles);
		map.put("Title", title);
		map.put("Description", des);
		map.put("PicUrl", picUrl);
		map.put("Url", url);
		map.put("FuncFlag", "1");
		return map;
	}

}
