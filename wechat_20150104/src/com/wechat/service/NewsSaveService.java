package com.wechat.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.NewsAddress;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;
import com.wechat.dao.NewssaveDAO;
import com.wechat.vo.Newssave;
import com.wechat.vo.SxJbxx;

public class NewsSaveService {
	private static final Integer Integer = null;
	private NewssaveDAO dao;

	public NewssaveDAO getDao() {
		return dao;
	}

	public void setDao(NewssaveDAO dao) {
		this.dao = dao;
	}
	
	public void save(Newssave ns){
		dao.save(ns);
	}
	
	public Newssave findById(Long id){
		Newssave result = new Newssave();
		try{
			result = dao.findById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public Newssave findByFbbz(Boolean fbbz){
		Newssave result = new Newssave();
		try {
			result = dao.findByFbbz(fbbz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Newssave> findByFbbzType(boolean fbbz,Integer type){
		List<Newssave> result =  null;
		try {
			result = dao.findByFbbzType(fbbz, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Newssave> showTopten(){
		List<Newssave> outcome = null;
		try{
			outcome	= dao.showTopten();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return outcome;
	}
	public List<Newssave> findByType(Integer type) {
		List<Newssave> result=null;
		try {
			result = dao.findByType(type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void updateFbbz(Boolean fbbz,Long id){
		dao.updateFbba(fbbz, id);
		System.out.println("update Newssave fbbz successful");
	}
	
	public void delete(Newssave ns){
		dao.delete(ns);
	}
}
