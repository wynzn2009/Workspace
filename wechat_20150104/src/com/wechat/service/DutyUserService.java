package com.wechat.service;

import java.util.ArrayList;
import java.util.List;

import com.wechat.vo.DutyUser;
import com.wechat.vo.Dw;
import com.wechat.dao.DutyUserDAO;

public class DutyUserService {

	private DutyUserDAO dao;
	
	public DutyUserService(){
		
	}
	
	
	


	public DutyUserDAO getDao() {
		return dao;
	}





	public void setDao(DutyUserDAO dao) {
		this.dao = dao;
	}





	public List<DutyUser> findByUserid(String userid){
		List<DutyUser> list = dao.findByUserid(userid);
		return list;
	}
	public List<String> dutyCodeList(String userid){
		List<String> res = new ArrayList<String>();
		List<DutyUser> list = findByUserid(userid);
		for (int i = 0; i < list.size(); i++) {
			res.add(list.get(i).getDutycode());
		}
		return res;
	}
}
