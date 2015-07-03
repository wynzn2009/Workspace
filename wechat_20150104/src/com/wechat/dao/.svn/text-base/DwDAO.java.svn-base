package com.wechat.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wechat.vo.Dw;

/**
 * A data access object (DAO) providing persistence and search support for Dw
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wechat.dao.Dw
 * @author MyEclipse Persistence Tools
 */

public class DwDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DwDAO.class);
	// property constants
	public static final String DWFULLNAME = "dwfullname";
	public static final String BELOINGTO = "beloingto";
	public static final String DWCODE = "dwcode";
	public static final String DWTELPHONE = "dwtelphone";
	public static final String DWADRESS = "dwadress";
	public static final String DW_SHORT_NAME = "dwShortName";
	public static final String DWAREACODE = "dwareacode";
	public static final String DWSTATUS = "dwstatus";
	public static final String DWCONTACTOR = "dwcontactor";
	public static final String DWCONTACTPHONE = "dwcontactphone";
	public static final String DWMANAGER = "dwmanager";
	public static final String DWGBCODE = "dwgbcode";
	public static final String DWLEVEL = "dwlevel";
	public static final String BELOINGTO_NAME = "beloingtoName";
	public static final String SHOWFLAG = "showflag";
	public static final String WWSHOWFLAG = "wwshowflag";
	public static final String DWJJ = "dwjj";
	private SessionFactory sessionFactory;
	private HibernateTemplate hibernateTemplate = null;
	

	protected void initDao() {
		// do nothing
	}

	public void save(Dw transientInstance) {
		log.debug("saving Dw instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Dw persistentInstance) {
		log.debug("deleting Dw instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	public void updateIntro(String intro,int dwid) {
		log.debug("updating Dwjj instance");
		
		hibernateTemplate = new HibernateTemplate();
		try {
			Dw dw = (Dw)getHibernateTemplate().get(Dw.class,dwid);
			System.out.println(dw);      //
			dw.setDwjj(intro);
			getHibernateTemplate().update(dw);
			log.debug("update dwjj successful");
		} catch (RuntimeException re) {
			log.error("update dwjj failed", re);
			throw re;
		}
	}
	
	public void updateTel(String tel,int dwid) {
		log.debug("updating Dw instance");
		
		hibernateTemplate = new HibernateTemplate();
		try {
			Dw dw = (Dw)getHibernateTemplate().get(Dw.class,dwid);
			System.out.println(dw);      //
			dw.setDwtelphone(tel);
			getHibernateTemplate().update(dw);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
	
	
	
	public Dw findById(java.lang.Integer id) {
		log.debug("getting Dw instance with id: " + id);
		try {
			Dw instance = (Dw) getHibernateTemplate().get("com.wechat.dao.Dw",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Dw instance) {
		log.debug("finding Dw instance by example");
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
		log.debug("finding Dw instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dw as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public Dw findByProperty1(String propertyName, Object value) {
		log.debug("finding Dw instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dw as model where model." + propertyName
					+ "= ?";
			return (Dw)getHibernateTemplate().find(queryString, value).get(0);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDwfullname(Object dwfullname) {
		return findByProperty(DWFULLNAME, dwfullname);
	}
	
	public Dw findByDwname(Object dwname){
		return findByProperty1(DWFULLNAME, dwname);
	}

	public List findByBeloingto(Object beloingto) {
		return findByProperty(BELOINGTO, beloingto);
	}

	public List findByDwcode(Object dwcode) {
		return findByProperty(DWCODE, dwcode);
	}

	public List findByDwtelphone(Object dwtelphone) {
		return findByProperty(DWTELPHONE, dwtelphone);
	}

	public List findByDwadress(Object dwadress) {
		return findByProperty(DWADRESS, dwadress);
	}

	public List findByDwShortName(Object dwShortName) {
		return findByProperty(DW_SHORT_NAME, dwShortName);
	}

	public List findByDwareacode(Object dwareacode) {
		return findByProperty(DWAREACODE, dwareacode);
	}

	public List findByDwstatus(Object dwstatus) {
		return findByProperty(DWSTATUS, dwstatus);
	}

	public List findByDwcontactor(Object dwcontactor) {
		return findByProperty(DWCONTACTOR, dwcontactor);
	}

	public List findByDwcontactphone(Object dwcontactphone) {
		return findByProperty(DWCONTACTPHONE, dwcontactphone);
	}

	public List findByDwmanager(Object dwmanager) {
		return findByProperty(DWMANAGER, dwmanager);
	}

	public List findByDwgbcode(Object dwgbcode) {
		return findByProperty(DWGBCODE, dwgbcode);
	}

	public List findByDwlevel(Object dwlevel) {
		return findByProperty(DWLEVEL, dwlevel);
	}

	public List findByBeloingtoName(Object beloingtoName) {
		return findByProperty(BELOINGTO_NAME, beloingtoName);
	}

	public List findByShowflag(Object showflag) {
		return findByProperty(SHOWFLAG, showflag);
	}

	public List findByWwshowflag(Object wwshowflag) {
		return findByProperty(WWSHOWFLAG, wwshowflag);
	}

	public List findByDwjj(Object dwjj) {
		return findByProperty(DWJJ, dwjj);
	}

	public List findAll() {
		log.debug("finding all Dw instances");
		try {
			String queryString = "from Dw";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Dw merge(Dw detachedInstance) {
		log.debug("merging Dw instance");
		try {
			Dw result = (Dw) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Dw instance) {
		log.debug("attaching dirty Dw instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Dw instance) {
		log.debug("attaching clean Dw instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DwDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DwDAO) ctx.getBean("DwDAO");
	}
}