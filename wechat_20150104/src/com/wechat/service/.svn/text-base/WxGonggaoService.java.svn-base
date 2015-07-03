package com.wechat.service;

import java.util.List;

import com.wechat.dao.WxGonggaoDAO;
import com.wechat.vo.Newssave;
import com.wechat.vo.WxGonggao;

public class WxGonggaoService {
	private WxGonggaoDAO dao;

	public WxGonggaoDAO getDao() {
		return dao;
	}

	public void setDao(WxGonggaoDAO dao) {
		this.dao = dao;
	}
	
	public void save(WxGonggao wxgg){
		dao.save(wxgg);
	}
	
	public WxGonggao findById(Long id){
		WxGonggao result = new WxGonggao();
		try{
			result = dao.findById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public List<WxGonggao> showTopten(){
		List<WxGonggao> outcome = null;
		try{
			outcome	= dao.showTopten();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return outcome;
	}
	

}
