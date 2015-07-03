package com.wechat.service;

import com.wechat.dao.*;
import com.wechat.vo.*;

public class TsxxfkService {
	
	private TsxxfkDAO dao; 
	
	public TsxxfkService(){
	}
	
	public void setDao(TsxxfkDAO dao){
		this.dao = dao;
	}
	
	public TsxxfkDAO getDao(){
		return dao;
	}
	
	public Tsxxfk findById(String serialNum, String idNum){
		Tsxxfk outcom = new Tsxxfk();
		try{
			if(serialNum == null || idNum == null){
				outcom = null;
			}else{
				outcom = dao.findById(serialNum);
				if(outcom != null){
					outcom = outcom.getCxmm().equals(idNum) ? outcom : null;	
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return outcom;
	}
}
