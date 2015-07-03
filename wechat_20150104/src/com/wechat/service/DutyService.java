package com.wechat.service;



import java.util.ArrayList;
import java.util.List;

import com.wechat.dao.DutyDAO;
import com.wechat.dao.DutyUserDAO;
import com.wechat.vo.Duty;
import com.wechat.service.DutyUserService;

public class DutyService {

	private DutyDAO dao;
	public DutyService(){
		
	}
	


	public DutyDAO getDao() {
		return dao;
	}



	public void setDao(DutyDAO dao) {
		this.dao = dao;
	}



	public String level(String dutycode){
		Duty duty = (Duty) dao.findByDutycode(dutycode).get(0);
		String level = duty.getDutylevel();
		return level;
		
	}

}
