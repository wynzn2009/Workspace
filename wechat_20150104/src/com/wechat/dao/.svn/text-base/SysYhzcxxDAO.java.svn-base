package com.wechat.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.wechat.vo.SysYhzcxx;

/**
 * A data access object (DAO) providing persistence and search support for
 * SysYhzcxx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wechat.dao.SysYhzcxx
 * @author MyEclipse Persistence Tools
 */

public class SysYhzcxxDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(SysYhzcxxDAO.class);
	// property constants
	public static final String YHNC = "yhnc";
	public static final String TYPECODE = "typecode";
	public static final String TYPE = "type";
	public static final String PASSWORD = "password";
	public static final String QUESTION = "question";
	public static final String ANSWER = "answer";
	public static final String EMAIL = "email";
	public static final String NAME = "name";
	public static final String ADDRESS = "address";
	public static final String PHONE = "phone";
	public static final String YL1 = "yl1";
	public static final String YL2 = "yl2";
	public static final String YL3 = "yl3";
	public static final String ZJHM = "zjhm";
	public static final String YYZZSQ = "yyzzsq";
	public static final String COMPANYNAME = "companyname";
	public static final String ZZJGDMZ = "zzjgdmz";
	public static final String FDDBR = "fddbr";
	public static final String FRSFZH = "frsfzh";
	public static final String YYZZBH = "yyzzbh";
	public static final String FAX = "fax";
	public static final String FRDH = "frdh";
	public static final String GLYBZ = "glybz";

	protected void initDao() {
		// do nothing
	}

	public void save(SysYhzcxx transientInstance) {
		log.debug("saving SysYhzcxx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SysYhzcxx persistentInstance) {
		log.debug("deleting SysYhzcxx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SysYhzcxx findById(java.lang.String id) {
		log.debug("getting SysYhzcxx instance with id: " + id);
		try {
			SysYhzcxx instance = (SysYhzcxx) getHibernateTemplate().get(
					"com.wechat.dao.SysYhzcxx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SysYhzcxx instance) {
		log.debug("finding SysYhzcxx instance by example");
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
		log.debug("finding SysYhzcxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SysYhzcxx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByYhnc(Object yhnc) {
		return findByProperty(YHNC, yhnc);
	}

	public List findByTypecode(Object typecode) {
		return findByProperty(TYPECODE, typecode);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByQuestion(Object question) {
		return findByProperty(QUESTION, question);
	}

	public List findByAnswer(Object answer) {
		return findByProperty(ANSWER, answer);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByYl1(Object yl1) {
		return findByProperty(YL1, yl1);
	}

	public List findByYl2(Object yl2) {
		return findByProperty(YL2, yl2);
	}

	public List findByYl3(Object yl3) {
		return findByProperty(YL3, yl3);
	}

	public List findByZjhm(Object zjhm) {
		return findByProperty(ZJHM, zjhm);
	}

	public List findByYyzzsq(Object yyzzsq) {
		return findByProperty(YYZZSQ, yyzzsq);
	}

	public List findByCompanyname(Object companyname) {
		return findByProperty(COMPANYNAME, companyname);
	}

	public List findByZzjgdmz(Object zzjgdmz) {
		return findByProperty(ZZJGDMZ, zzjgdmz);
	}

	public List findByFddbr(Object fddbr) {
		return findByProperty(FDDBR, fddbr);
	}

	public List findByFrsfzh(Object frsfzh) {
		return findByProperty(FRSFZH, frsfzh);
	}

	public List findByYyzzbh(Object yyzzbh) {
		return findByProperty(YYZZBH, yyzzbh);
	}

	public List findByFax(Object fax) {
		return findByProperty(FAX, fax);
	}

	public List findByFrdh(Object frdh) {
		return findByProperty(FRDH, frdh);
	}

	public List findByGlybz(Object glybz) {
		return findByProperty(GLYBZ, glybz);
	}

	public List findAll() {
		log.debug("finding all SysYhzcxx instances");
		try {
			String queryString = "from SysYhzcxx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SysYhzcxx merge(SysYhzcxx detachedInstance) {
		log.debug("merging SysYhzcxx instance");
		try {
			SysYhzcxx result = (SysYhzcxx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SysYhzcxx instance) {
		log.debug("attaching dirty SysYhzcxx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SysYhzcxx instance) {
		log.debug("attaching clean SysYhzcxx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SysYhzcxxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SysYhzcxxDAO) ctx.getBean("SysYhzcxxDAO");
	}
}