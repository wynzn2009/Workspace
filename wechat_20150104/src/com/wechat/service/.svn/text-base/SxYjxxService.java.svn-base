package com.wechat.service;

import java.util.ArrayList;
import java.util.List;

import com.wechat.dao.*;
import com.wechat.vo.*;

public class SxYjxxService {

	private SxYjxxDAO dao; 
	
	public SxYjxxService(){
	}
	
	public void setDao(SxYjxxDAO dao){
		this.dao = dao;
	}
	
	public SxYjxxDAO getDao(){
		return this.dao;
	}
	
	public ArrayList<SxYjxx> findBySxbm(String sxbm){
		ArrayList<SxYjxx> outcom = new ArrayList<SxYjxx>();
		List<?> tmp = null;
		try{
			tmp = dao.findBySxbm(sxbm);
			for(int i = 0; i < tmp.size(); i++){
				outcom.add((SxYjxx)tmp.get(i));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return outcom;
	}
}
