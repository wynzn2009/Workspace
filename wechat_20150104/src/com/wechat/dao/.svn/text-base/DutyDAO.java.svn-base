package com.wechat.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.wechat.vo.Duty;

/**
 * A data access object (DAO) providing persistence and search support for Duty
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wechat.dao.Duty
 * @author MyEclipse Persistence Tools
 */

public class DutyDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DutyDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String DUTYLEVEL = "dutylevel";
	public static final String DWCODE = "dwcode";
	public static final String DWSHORTNAME = "dwshortname";
	public static final String DUTYCODE = "dutycode";
	public static final String UP = "up";

	protected void initDao() {
		// do nothing
	}

	public void save(Duty transientInstance) {
		log.debug("saving Duty instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Duty persistentInstance) {
		log.debug("deleting Duty instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Duty findById(java.lang.Integer id) {
		log.debug("getting Duty instance with id: " + id);
		try {
			Duty instance = (Duty) getHibernateTemplate().get(
					"com.wechat.dao.Duty", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Duty instance) {
		log.debug("finding Duty instance by example");
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
		log.debug("finding Duty instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Duty as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByDutylevel(Object dutylevel) {
		return findByProperty(DUTYLEVEL, dutylevel);
	}

	public List findByDwcode(Object dwcode) {
		return findByProperty(DWCODE, dwcode);
	}

	public List findByDwshortname(Object dwshortname) {
		return findByProperty(DWSHORTNAME, dwshortname);
	}

	public List findByDutycode(Object dutycode) {
		return findByProperty(DUTYCODE, dutycode);
	}

	public List findByUp(Object up) {
		return findByProperty(UP, up);
	}

	public List findAll() {
		log.debug("finding all Duty instances");
		try {
			String queryString = "from Duty";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Duty merge(Duty detachedInstance) {
		log.debug("merging Duty instance");
		try {
			Duty result = (Duty) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Duty instance) {
		log.debug("attaching dirty Duty instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Duty instance) {
		log.debug("attaching clean Duty instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DutyDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DutyDAO) ctx.getBean("DutyDAO");
	}
}