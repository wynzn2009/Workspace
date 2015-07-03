package com.wechat.service;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.dao.*;
import com.wechat.vo.*;

public class userInfoService {
	public userInfoService(){
		
	}
	
	private UserinfoDAO dao;
    
	

	public UserinfoDAO getDao() {
		return dao;
	}



	public void setDao(UserinfoDAO dao) {
		this.dao = dao;
	}

	public void updatePsw(String new_psw,int id){
		dao.updatePsw(new_psw, id);
		System.out.println("update password sucess");
	}

	public boolean checkIn(String userInfo, String userPsw){       //返回vo类
		ArrayList<Userinfo> list = new ArrayList<Userinfo>();
		List<?> out = null;
		boolean exist = false;
		try{
		out = dao.findByProperties(userInfo, userPsw);
		for(int i = 0; i < out.size(); i++){
			list.add((Userinfo)out.get(i));
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		dao.findByProperties(userInfo, userPsw);
		if(list.size()>0){
			exist = true;
		}else exist = false;
		return exist;
	}
	
	public ArrayList<Userinfo> findByName(String username){       //返回vo类
		ArrayList<Userinfo> list = new ArrayList<Userinfo>();
		List<?> out = null;
		try{
		out = dao.findByUserid(username);
		for(int i = 0; i < out.size(); i++){
			list.add((Userinfo)out.get(i));
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		dao.findByUname(username);
		return list;
	}
	
}
