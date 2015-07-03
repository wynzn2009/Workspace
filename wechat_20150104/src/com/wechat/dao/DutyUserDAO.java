package com.wechat.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.wechat.vo.DutyUser;

/**
 * A data access object (DAO) providing persistence and search support for
 * DutyUser entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wechat.dao.DutyUser
 * @author MyEclipse Persistence Tools
 */

public class DutyUserDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(DutyUserDAO.class);
	// property constants
	public static final String DUTYCODE = "dutycode";
	public static final String USERID = "userid";

	protected void initDao() {
		// do nothing
	}

	public void save(DutyUser transientInstance) {
		log.debug("saving DutyUser instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DutyUser persistentInstance) {
		log.debug("deleting DutyUser instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DutyUser findById(java.lang.Integer id) {
		log.debug("getting DutyUser instance with id: " + id);
		try {
			DutyUser instance = (DutyUser) getHibernateTemplate().get(
					"com.wechat.dao.DutyUser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DutyUser instance) {
		log.debug("finding DutyUser instance by example");
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
		log.debug("finding DutyUser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DutyUser as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDutycode(Object dutycode) {
		return findByProperty(DUTYCODE, dutycode);
	}

	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findAll() {
		log.debug("finding all DutyUser instances");
		try {
			String queryString = "from DutyUser";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DutyUser merge(DutyUser detachedInstance) {
		log.debug("merging DutyUser instance");
		try {
			DutyUser result = (DutyUser) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DutyUser instance) {
		log.debug("attaching dirty DutyUser instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DutyUser instance) {
		log.debug("attaching clean DutyUser instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DutyUserDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DutyUserDAO) ctx.getBean("DutyUserDAO");
	}
}