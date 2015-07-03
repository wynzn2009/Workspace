package com.wechat.service;

import java.util.HashMap;
import java.util.List;
//import com.aj.gg.entity.VO_tsxx;
import com.wechat.dao.*;
import com.wechat.vo.*;


public class TsxxService {
	
	private TsxxDAO dao; 
	//private static HashMap lshMap;
	private static final HashMap lshMap = new HashMap();
	
	public TsxxService(){
	}
	public TsxxDAO getDao() {
		return dao;
	}

	public void setDao(TsxxDAO dao) {
		this.dao = dao;
	}

	public void save(Tsxx t){
		dao.save(t);
		System.out.println("save sucess");
	}
	
	public void init(){	
		//lshMap = new HashMap();
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMdd"); 
		java.util.Date currentTime = new java.util.Date();
		String str_currenttime = formatter.format(currentTime);
		str_currenttime="WTS"+str_currenttime;
		
		String last = dao.getMaxBjlsh(str_currenttime);
		Integer lsh = 0;
		if(last==null){
			lshMap.put(str_currenttime,lsh);	
		}
		else
		{
			String snum=last.substring(11);
			Integer inum=Integer.parseInt(snum);
			lshMap.put(str_currenttime,inum);
		}
	  }
	
	public String getNum() throws Exception {		
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyyMMdd"); 
		java.util.Date currentTime = new java.util.Date();
		String str_currenttime = formatter.format(currentTime);
		str_currenttime="WTS"+str_currenttime;
		Integer i;		
		synchronized(lshMap) {
			 i = (Integer)lshMap.get(str_currenttime);
			 if(i==null)
			 {
				 init();
				 i = (Integer)lshMap.get(str_currenttime);
			 }
				i++;
				lshMap.put(str_currenttime, i);		
		}
		String newbjlsh="";
		java.text.DecimalFormat df=new java.text.DecimalFormat("0000");
		String snum=df.format(i);
		 newbjlsh=str_currenttime+snum;
		return newbjlsh;
			
	}
	
	public List<Tsxx> findByLsh(String bjlsh,String psd){
		return dao.findByLsh(bjlsh, psd);
	}
	
}
