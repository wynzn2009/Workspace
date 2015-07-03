package com.wechat.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.wechat.vo.Userinfo;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 * A data access object (DAO) providing persistence and search support for
 * Userinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wechat.dao.Userinfo
 * @author MyEclipse Persistence Tools
 */

public class UserinfoDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(UserinfoDAO.class);
	// property constants
	public static final String USERID = "userid";
	public static final String UPWD = "upwd";
	public static final String UNAME = "uname";
	public static final String UGENDER = "ugender";
	public static final String USTATUS = "ustatus";
	public static final String UPHONE = "uphone";
	public static final String UADDRESS = "uaddress";
	public static final String UMANAGER = "umanager";
	public static final String DWCODE = "dwcode";
	public static final String DWNAME = "dwname";
	public static final String IPADDRESS = "ipaddress";
	public static final String SFKYJJ = "sfkyjj";
	
	private HibernateTemplate hibernateTemplate = null;

	protected void initDao() {
		// do nothing
	}

	public void save(Userinfo transientInstance) {
		log.debug("saving Userinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Userinfo persistentInstance) {
		log.debug("deleting Userinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Userinfo findById(java.lang.Integer id) {
		log.debug("getting Userinfo instance with id: " + id);
		try {
			Userinfo instance = (Userinfo) getHibernateTemplate().get(
					"com.wechat.dao.Userinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Userinfo instance) {
		log.debug("finding Userinfo instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Userinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Userinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public List findByProperties(String userName, String userPsw) {
		log.debug("finding Userinfo by userNmae and userPsw.");
		try {
			String queryString = "from Userinfo as model where model.userid = ? and model.upwd = ? " ;
			return getHibernateTemplate().find(queryString, new String[]{userName,userPsw});
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public void updatePsw(String new_psw,int id) { //id:primary key
		log.debug("updating user_psw instance");
		
		hibernateTemplate = new HibernateTemplate();
		try {
			Userinfo users = (Userinfo)getHibernateTemplate().get(Userinfo.class,id);
			users.setUpwd(new_psw);
			getHibernateTemplate().update(users);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
	
	
	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findByUpwd(Object upwd) {
		return findByProperty(UPWD, upwd);
	}

	public List findByUname(Object uname) {
		return findByProperty(UNAME, uname);
	}

	public List findByUgender(Object ugender) {
		return findByProperty(UGENDER, ugender);
	}

	public List findByUstatus(Object ustatus) {
		return findByProperty(USTATUS, ustatus);
	}

	public List findByUphone(Object uphone) {
		return findByProperty(UPHONE, uphone);
	}

	public List findByUaddress(Object uaddress) {
		return findByProperty(UADDRESS, uaddress);
	}

	public List findByUmanager(Object umanager) {
		return findByProperty(UMANAGER, umanager);
	}

	public List findByDwcode(Object dwcode) {
		return findByProperty(DWCODE, dwcode);
	}

	public List findByDwname(Object dwname) {
		return findByProperty(DWNAME, dwname);
	}

	public List findByIpaddress(Object ipaddress) {
		return findByProperty(IPADDRESS, ipaddress);
	}

	public List findBySfkyjj(Object sfkyjj) {
		return findByProperty(SFKYJJ, sfkyjj);
	}

	public List findAll() {
		log.debug("finding all Userinfo instances");
		try {
			String queryString = "from Userinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Userinfo merge(Userinfo detachedInstance) {
		log.debug("merging Userinfo instance");
		try {
			Userinfo result = (Userinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Userinfo instance) {
		log.debug("attaching dirty Userinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Userinfo instance) {
		log.debug("attaching clean Userinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UserinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UserinfoDAO) ctx.getBean("UserinfoDAO");
	}
	
	public List findByNameAndPsw(Object userid,Object psw) {
		return findByProperty(USERID, userid);
	}
}