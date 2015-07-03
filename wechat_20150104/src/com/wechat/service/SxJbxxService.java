package com.wechat.service;

import java.util.ArrayList;
import java.util.List;

import com.wechat.dao.*;
import com.wechat.entity.*;
import com.wechat.vo.*;

public class SxJbxxService {
	private SxJbxxDAO dao; 
	
	public SxJbxxService(){
		
	}
	
	public SxJbxxDAO getDao(){
		return dao;
	}
	
	public void setDao(SxJbxxDAO dao){
		this.dao = dao;
	}
	
	public ArrayList<SxJbxxEntity> findByCbjgmb(String cbjgmc,int pageIndex, int perPage){
		ArrayList<SxJbxxEntity> outcom = new ArrayList<SxJbxxEntity>();
		List<?> tmp = null;
		int startRow = (pageIndex - 1) * perPage;
		try{
			tmp = dao.findByCbjgmc(cbjgmc,startRow,perPage);
			for(int i = 0; i < tmp.size(); i++){
				outcom.add(EntityUtility.convertSxJbxx(tmp.get(i)));
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return outcom;
	}
	
	public int getTotalCount(String cbjgmc){
		int totalCount = 0;
		try{
			totalCount = dao.getTotalCount(cbjgmc);
		}catch(Exception e){
			e.printStackTrace();
		}
		return totalCount;
	}
	
	public SxJbxx findById(String sxbm){
		SxJbxx outcom = new SxJbxx();
		try{
			outcom = dao.findById(sxbm);
		}catch(Exception e){
			e.printStackTrace();
		}
		return outcom;
	}
}
