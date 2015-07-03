package com.wechat.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.wechat.vo.*;

/**
 * A data access object (DAO) providing persistence and search support for
 * SxYjxx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wechat.dao.SxYjxx
 * @author MyEclipse Persistence Tools
 */

public class SxYjxxDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SxYjxxDAO.class);
	// property constants
	public static final String SXBM = "sxbm";
	public static final String YJMC = "yjmc";
	public static final String YJLX = "yjlx";
	public static final String XSSXH = "xssxh";
	public static final String XYTJBZ = "xytjbz";
	public static final String URLLJDZ = "urlljdz";
	public static final String MBWJMC = "mbwjmc";
	public static final String MBWJNR = "mbwjnr";
	public static final String SMWJMC = "smwjmc";
	public static final String SMWJNR = "smwjnr";
	public static final String YBWJMC = "ybwjmc";
	public static final String YBWJNR = "ybwjnr";
	public static final String YJMS = "yjms";
	public static final String BDZDYS = "bdzdys";
	public static final String BZ = "bz";
	public static final String ZHXGRY = "zhxgry";
	public static final String BZBM = "bzbm";
	public static final String BZMC = "bzmc";
	public static final String UP = "up";

	protected void initDao() {
		// do nothing
	}

	public void save(SxYjxx transientInstance) {
		log.debug("saving SxYjxx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SxYjxx persistentInstance) {
		log.debug("deleting SxYjxx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SxYjxx findById(java.lang.Long id) {
		log.debug("getting SxYjxx instance with id: " + id);
		try {
			SxYjxx instance = (SxYjxx) getHibernateTemplate().get(
					"com.wechat.dao.SxYjxx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<?> findByExample(SxYjxx instance) {
		log.debug("finding SxYjxx instance by example");
		try {
			List<?> results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List<?> findByProperty(String propertyName, Object value) {
		log.debug("finding SxYjxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SxYjxx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<?> findBySxbm(Object sxbm) {
		return findByProperty(SXBM, sxbm);
	}

	public List<?> findAll() {
		log.debug("finding all SxYjxx instances");
		try {
			String queryString = "from SxYjxx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SxYjxx merge(SxYjxx detachedInstance) {
		log.debug("merging SxYjxx instance");
		try {
			SxYjxx result = (SxYjxx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SxYjxx instance) {
		log.debug("attaching dirty SxYjxx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SxYjxx instance) {
		log.debug("attaching clean SxYjxx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SxYjxxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SxYjxxDAO) ctx.getBean("SxYjxxDAO");
	}
}