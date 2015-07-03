package com.wechat.service;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wechat.dao.*;
import com.wechat.vo.*;
/**
 * BjService 引用bjjbxxdao 和 bjlcclxxdao，用于处理跟办件相关的业务
 * @author Administrator
 *
 */
public class BjService {
	private BjJbxxDAO bjjbxxdao;
	private BjLcclxxDAO bjlcclxxdao;
    
	public BjService(){
		
	}
	
	public BjJbxxDAO getBjjbxxdao() {
		return bjjbxxdao;
	}
	public void setBjjbxxdao(BjJbxxDAO bjjbxxdao) {
		this.bjjbxxdao = bjjbxxdao;
	}
	public BjLcclxxDAO getBjlcclxxdao() {
		return bjlcclxxdao;
	}
	public void setBjlcclxxdao(BjLcclxxDAO bjlcclxxdao) {
		this.bjlcclxxdao = bjlcclxxdao;
	}
	
	public List<BjLcclxx> findBj(String bjlsh,String sxmc,String sqz,String lxdh){
		return bjjbxxdao.findBj(bjlsh,sxmc,sqz,lxdh);
	}
	
	public List<BjJbxx> findBj2(String bjlsh,String sqz,String lxdh){
		return bjjbxxdao.findBj2(bjlsh,sqz,lxdh);
	}
	
	public BjJbxx findBjjbxx(String bjlsh){
		return bjjbxxdao.findByBjlsh(bjlsh);

	}
	/**
	 * 根据办件流水号查询流程处理信息
	 * @param bjlsh
	 * @return
	 */
	public List findLcclxxbyBjlsh(String bjlsh){
		return this.bjlcclxxdao.findByBjlsh(bjlsh);		
	}
		
}
