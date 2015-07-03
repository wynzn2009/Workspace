package com.wechat.service;

import java.util.ArrayList;
import java.util.List;

import com.wechat.dao.DwDAO;
import com.wechat.vo.Dw;

public class DwService {
	public DwService(){
	}
	
	private DwDAO dao;

	public DwDAO getDao() {
		return dao;
	}

	public void setDao(DwDAO dao) {
		this.dao = dao;
	}
	
	public void updateTel(String tel,int dwid){
		dao.updateTel(tel,dwid);
		System.out.println("update tel sucess");
	}
	
	public void updateIntro(String intro,int dwid){
		dao.updateIntro(intro,dwid);
		System.out.println("update dwjj sucess");
	}
	
	public ArrayList<Dw> findByBeloingto(String beloingto){       //返回vo类
		ArrayList<Dw> list = new ArrayList<Dw>();
		List<?> out = null;
		try{
		out = dao.findByBeloingto(beloingto);
		for(int i = 0; i < out.size(); i++){
			list.add((Dw)out.get(i));
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		dao.findByBeloingto(beloingto);
		return list;
	}
	public ArrayList<Dw> findByDwcode(String dwcode){       //返回vo类
		ArrayList<Dw> list = new ArrayList<Dw>();
		List<?> out = null;
		try{
		out = dao.findByDwcode(dwcode);
		for(int i = 0; i < out.size(); i++){
			list.add((Dw)out.get(i));
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		dao.findByDwcode(dwcode);
		return list;
	}
	
	public ArrayList<Dw> findByDwfullname(String dwfullname){       //返回vo类
		ArrayList<Dw> list = new ArrayList<Dw>();
		List<?> out = null;
		try{
		out = dao.findByDwfullname(dwfullname);
		for(int i = 0; i < out.size(); i++){
			list.add((Dw)out.get(i));
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		dao.findByDwcode(dwfullname);
		return list;
	}
	public Dw findByDwname(String dwname){
		Dw dw = new Dw();
		try {
			dw = dao.findByDwname(dwname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dw;
	}
	
		
	
	public String getTelphone(String dwfullname){
		String tel = "";
		
		return tel;
	}
	
}
