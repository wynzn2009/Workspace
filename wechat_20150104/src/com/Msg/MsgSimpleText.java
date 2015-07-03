package com.Msg;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.context.ApplicationContext;

import Test.TestData;

import com.ApplicationContextUtils;
import com.wechat.service.BjService;
import com.wechat.service.SxJbxxService;
import com.wechat.vo.BjJbxx;
import com.wechat.vo.BjLcclxx;
import com.wechat.service.DwService;
import com.wechat.vo.Dw;

/**
 * 文本消息的处理 
 */
public class MsgSimpleText extends BaseMsg{
	private Map msgMap;
	private String content;
	private Map dealtMap;
	
	
	public MsgSimpleText(Map map){
		this.msgMap = map;
		if(this.msgMap.containsKey("Content")){
			this.content = (String)this.msgMap.get("Content");
		}else{
			this.content = "";
		}
		this.excute();
	}
	public Map getHandledMap(){
		System.out.println("from msgsimpletext msg"); 
		return this.dealtMap;
	}
	protected void excute(){
		String type = this.filterTaskByContent(this.content);
		this.dealtMap = this.excuteTask(type);
	}
	/**
	 * 用于分析Content内容，得到对应的业务类型
	 * @return String TaskType
	 */
	private String filterTaskByContent(String content){
		//办件查询
		Pattern bjp = Pattern.compile("bj1302\\d{4}20\\d{2}[01]\\d[0123]\\d{5}");
		Pattern bjp1 = Pattern.compile("bjW1302\\d{4}20\\d{2}[01]\\d[0123]\\d{5}");
		Matcher bjm = bjp.matcher(content);
		Matcher bjm1 = bjp1.matcher(content);
		if(bjm.find()||bjm1.find()){
			return "bjjdcx";
		}
		//事项查询方式1:输入 dw1 已废除该查询方式
		Pattern sxp = Pattern.compile("dw\\d{0,2}");
		Matcher sxm = sxp.matcher(content);
		if(sxm.find()){
			if(sxm.group().equals(content)){
				return "sxcx1";
			}
		}
		//事项查询方式2： 输入 工商局
		List<String> dw = new ArrayList<String>();//sql select
		
		ApplicationContext ctx = ApplicationContextUtils.getApplicationContext();
		DwService dwService = (DwService)ctx.getBean("DwService");
		String beloingto = "13020000";
		List<Dw> dwList = dwService.findByBeloingto(beloingto);
		for (int i = 0; i < dwList.size(); i++) {
			Dw temp = dwList.get(i);
			String dwName = temp.getDwfullname();
			dw.add(dwName);
		}
//		dw.add("安监局");
//		dw.add("城管局");
//		dw.add("住建局");
//		dw.add("财政局");
//		dw.add("发改委");
//		dw.add("法制办");
//		dw.add("公安局");
//		dw.add("工信局");
//		dw.add("规划局");
//		dw.add("国土局");
//		dw.add("国资委");
//		dw.add("环保局");
//		dw.add("计生局");
//		dw.add("交通局");
//		dw.add("教育局");
//		dw.add("科技局");
//		dw.add("粮食局");
		if(dw.contains(content.trim())){
			return "sxcx2";
		}
		//在线投诉
		
		return "";
	}
	/**
	 * 根据不同的业务类型，调用不同的业务方法进行处理，返回处理字符串
	 * @param type
	 * @return String result
	 */
	private Map excuteTask(String type){
		Map result=new HashMap();
		//type均来自从filterTaskByContent分析
		if(type.contains("bjjdcx")){
			result = this.msgMap; 
			String con = excuteBJJDCX();
			result.put("Content", con);	
			return result;
		}
		if(type.contains("sxcx")){
			result = this.msgMap; //图文消息，若图文消息是json，则map里key value为"json","构建的jsonStr"
			if(type.equals("sxcx1")){
				//找到对应的局名称
				int dwNo = Integer.valueOf(this.content.substring(2));
				switch(dwNo){
					case 0:break;
					case 1:this.content = "安监局" ;break;
					case 2:this.content = "城管局" ;break;
					case 3:this.content = "住建局" ;break;
					case 4:this.content = "财政局" ;break;
					case 5:this.content = "发改委" ;break;
					case 6:this.content = "法制办" ;break;
					case 7:this.content = "公安局" ;break;
					case 8:this.content = "工信局" ;break;
					case 9:this.content = "工商局" ;break;
					}
			}else if(type.equals("sxcx2")){
				//content就是局单位名称
			}
			String con = excuteSXCX();
			con = con.equals("")?"没有您查询的信息":con;
			result.put("Content", con);
			return result;
		}
		result = this.msgMap;
		result.put("Content", "您输入的指令无法被系统识别，请检查是否输入正确，或点击微信左下角切换至菜单进行相关业务办理咨询。");
		return result;
	}
	/**
	 * 查询办件进度
	 * @return
	 */
	private String excuteBJJDCX(){
		ApplicationContext ctx = ApplicationContextUtils.getApplicationContext();
		BjService bjService = (BjService)ctx.getBean("BjService");
		SxJbxxService sxService = (SxJbxxService)ctx.getBean("SxJbxxService");
		String bjlsh = this.content.substring(2);//去掉bj前缀
		List list = bjService.findLcclxxbyBjlsh(bjlsh);//获得该办件流程处理信息
		if(list==null||list.size()==0){
			return "您输入的办件流水号还未创建，请查看流水号是否输入正确，如果您忘了办件流水号，请点击\n" + PublicNetAddress.mutibjcx;
		}else {	
		String result = "暂无办件信息，您可以到政务大厅进行查询。";
		String sxmc = "";
		BjJbxx vobjjbxx = bjService.findBjjbxx(bjlsh);
		if(vobjjbxx!=null){
			sxmc = vobjjbxx.getSxmc();
		}
		String bjjd = "";
		boolean isBJTG = false;
		for(int i=0;i<list.size();i++){
			BjLcclxx lcxx = (BjLcclxx)list.get(i);
			String bzbm = lcxx.getBzbm();
			String bzmc = lcxx.getBzmc();
			String rwzt = lcxx.getRwzt();
			if(rwzt.equals("处理中")){
				bjjd = bzmc;
				break;
			}else if(bzbm.equals("600")){
				bjjd = "已办结";
				Date date = lcxx.getSjwcsj();
				isBJTG = true;
				break;
			}
		}
		//String template1 = "您的办件已经办结regex0天，若需要取件，请及时取件。该办件办事流程如下<regex2>步：\nregex3\n";
		String template1 = "您的办件已经办结regex0，若需要取件，请及时取件。";
		//String template2 = "您的办件正在<regex1>中，该办件办事流程如下<regex2>步：\nregex3\n您已办到第<regex4>步";
		String template2 = "您的<regex0>办件regex2正在<regex1>中。";
		if(isBJTG){
			String con = template1.replaceAll("regex0", String.valueOf(""));
			//return con;
			result = con;
		}else if(!bjjd.equals("")){
			String con = template2.replaceAll("regex1", bjjd)
								.replaceAll("regex0", sxmc)
								.replaceAll("regex2", bjlsh);
			//return con;
			result = con;
		}
		return result;
		//return "您所需要的办件信息尚未公开，请到大厅咨询详情。";
		}
	}
	/**
	 * 查询事项
	 * @return
	 */
	private String excuteSXCX(){
		ApplicationContext ctx = ApplicationContextUtils.getApplicationContext();
		SxJbxxService sxJbxxService = (SxJbxxService)ctx.getBean("SxJbxxService");
		
		if(this.content.equals("工商局")){
			int count = sxJbxxService.getTotalCount("工商局");
			return "工商局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=工商局\">工商局事项列表</a>\n";
		}
		if(this.content.equals("安监局")){
			int count = sxJbxxService.getTotalCount("安监局");
			return "安监局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=安监局\">安监局事项列表</a>\n";
		}
		if(this.content.equals("城管局")){
			int count = sxJbxxService.getTotalCount("城管局");
			return "城管局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=城管局\">城管局事项列表</a>\n";
		}
		if(this.content.equals("住建局")){
			int count = sxJbxxService.getTotalCount("住建局");
			return "住建局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=住建局\">住建局事项列表</a>\n";
		}
		if(this.content.equals("财政局")){
			int count = sxJbxxService.getTotalCount("财政局");
			return "财政局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=财政局\">财政局事项列表</a>\n";
		}
		if(this.content.equals("民政局")){
			int count = sxJbxxService.getTotalCount("民政局");
			return "民政局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=民政局\">民政局事项列表</a>\n";
		}
		if(this.content.equals("工信局")){
			int count = sxJbxxService.getTotalCount("工信局");
			return "工信局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=工信局\">工信局事项列表</a>\n";
		}
		if(this.content.equals("食药监局")){
			int count = sxJbxxService.getTotalCount("食药监局");
			return "食药监局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=食药监局\">食药监局事项列表</a>\n";
		}
		if(this.content.equals("发改委")){
			int count = sxJbxxService.getTotalCount("发改委");
			return "发改委共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=发改委\">发改委事项列表</a>\n";
		}
		if(this.content.equals("法制办")){
			int count = sxJbxxService.getTotalCount("法制办");
			return "法制办共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=法制办\">法制办事项列表</a>\n";
		}
		if(this.content.equals("公安局")){
			int count = sxJbxxService.getTotalCount("公安局");
			return "公安局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=公安局\">公安局事项列表</a>\n";
		}
		if(this.content.equals("规划局")){
			int count = sxJbxxService.getTotalCount("规划局");
			return "规划局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=规划局\">规划局事项列表</a>\n";
		}
		if(this.content.equals("国土局")){
			int count = sxJbxxService.getTotalCount("国土局");
			return "国土局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=国土局\">国土局事项列表</a>\n";
		}
		if(this.content.equals("国资委")){
			int count = sxJbxxService.getTotalCount("国资委");
			return "国资委共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=国资委\">国资委事项列表</a>\n";
		}
		if(this.content.equals("环保局")){
			int count = sxJbxxService.getTotalCount("环保局");
			return "环保局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=环保局\">环保局事项列表</a>\n";
		}
		if(this.content.equals("计生局")){
			int count = sxJbxxService.getTotalCount("计生局");
			return "计生局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=计生局\">计生局事项列表</a>\n";
		}
		if(this.content.equals("交通局")){
			int count = sxJbxxService.getTotalCount("交通局");
			return "交通局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=交通局\">交通局事项列表</a>\n";
		}
		if(this.content.equals("教育局")){
			int count = sxJbxxService.getTotalCount("教育局");
			return "教育局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=教育局\">教育局事项列表</a>\n";
		}
		if(this.content.equals("科技局")){
			int count = sxJbxxService.getTotalCount("科技局");
			return "科技局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=科技局\">科技局事项列表</a>\n";
		}
		if(this.content.equals("粮食局")){
			int count = sxJbxxService.getTotalCount("粮食局");
			return "粮食局共有事项" + count +"个" + 
			"具体事项列表请查看：<a href=\"" +	PublicNetAddress.url +	"/servlet/sxSearch?pageIndex=1&perPage=10&dwname=粮食局\">粮食局事项列表</a>\n";
		}
		else return "点此查看具体部门列表：<a href=\"" +	PublicNetAddress.url +	"/yw/bmsx.jsp\">大厅所有部门事项</a>\n";
	}

}
