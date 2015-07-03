package com.wechat.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.NewsAddress;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wechat.vo.Dw;
import com.wechat.vo.Newssave;

/**
 * A data access object (DAO) providing persistence and search support for
 * Newssave entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wechat.dao.Newssave
 * @author MyEclipse Persistence Tools
 */

public class NewssaveDAO extends BaseDAO {
	private static final Logger log = LoggerFactory
			.getLogger(NewssaveDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String AUTHOR = "author";
	public static final String COVER = "cover";
	public static final String CONTENT = "content";
	public static final String FBBZ = "fbbz";
	public static final String TYPE = "type";
	private SessionFactory sessionFactory;
	private HibernateTemplate hibernateTemplate = null;
	
	

	protected void initDao() {
		// do nothing
	}

	public void save(Newssave transientInstance) {
		log.debug("saving Newssave instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Newssave persistentInstance) {
		log.debug("deleting Newssave instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	public void updateFbba(Boolean fbbz,Long id){
		log.debug("update fbbz instance");
		
		hibernateTemplate = new HibernateTemplate();
		try {
			Newssave ns = (Newssave)getHibernateTemplate().get(Newssave.class, id);
			ns.setFbbz(fbbz);
			getHibernateTemplate().update(ns);
			log.debug("update Newssave Fbbz successful");
		} catch (RuntimeException re) {
			log.error("update Newssave fbbz failed", re);
			throw re;
		}
	}
	

	public Newssave findById(java.lang.Long id) {
		log.debug("getting Newssave instance with id: " + id);
		try {
			Newssave instance = (Newssave) getHibernateTemplate().get(
					"com.wechat.vo.Newssave", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Newssave instance) {
		log.debug("finding Newssave instance by example");
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
		log.debug("finding Newssave instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Newssave as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public List findByFbbzType(Boolean fbbz, Integer type) {
		log.debug("finding Newssave by fbbz and type.");
		try {
			Object[] value = {fbbz,type};
			String queryString = "from Newssave as model where model.fbbz = ? and model.type = ? order by time desc" ;
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property fbbz and type failed", re);
			throw re;
		}
	}
	
	public Newssave findByProperty1(String propertyName, Object value) {
		log.debug("finding Newssave instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Newssave as model where model."
					+ propertyName + "= ?";
			List out = getHibernateTemplate().find(queryString, value);
			Newssave ns = out==null?null:(Newssave)out.get(0);
			return ns;
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	public List findByProperty2(String propertyName, Object value) {
		log.debug("finding Newssave instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Newssave as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByAuthor(Object author) {
		return findByProperty(AUTHOR, author);
	}

	public List findByCover(Object cover) {
		return findByProperty(COVER, cover);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}
	
	public List findByType(Object type) {
		return findByProperty2(TYPE, type);
	}
	public Newssave findByFbbz(Object fbbz){
		return findByProperty1(FBBZ, fbbz);
	}
	

	public List findAll() {
		log.debug("finding all Newssave instances");
		try {
			String queryString = "from Newssave";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Newssave merge(Newssave detachedInstance) {
		log.debug("merging Newssave instance");
		try {
			Newssave result = (Newssave) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Newssave instance) {
		log.debug("attaching dirty Newssave instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Newssave instance) {
		log.debug("attaching clean Newssave instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static NewssaveDAO getFromApplicationContext(ApplicationContext ctx) {
		return (NewssaveDAO) ctx.getBean("NewssaveDAO");
	}
	
	//XSY 140918
	public List<Newssave> showTopten(){
		try {
			String hql = "from Newssave ns order by ns.time desc";
			getHibernateTemplate().setMaxResults(10);
			return getHibernateTemplate().find(hql);
		} catch (RuntimeException re) {
			System.out.println("error");
			log.error("find failed", re);
			throw re;
		}
	}
}