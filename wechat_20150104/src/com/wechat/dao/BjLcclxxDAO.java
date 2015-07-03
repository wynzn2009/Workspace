package com.wechat.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.wechat.vo.*;

/**
 * A data access object (DAO) providing persistence and search support for
 * BjLcclxx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wechat.dao.BjLcclxx
 * @author MyEclipse Persistence Tools
 */

public class BjLcclxxDAO extends BaseDAO {
	private static final Logger log = LoggerFactory
			.getLogger(BjLcclxxDAO.class);
	// property constants
	public static final String BJLSH = "bjlsh";
	public static final String SXBM = "sxbm";
	public static final String BZBM = "bzbm";
	public static final String BZMC = "bzmc";
	public static final String BZLX = "bzlx";
	public static final String QXRWLSH = "qxrwlsh";
	public static final String QXBZBM = "qxbzbm";
	public static final String QXBZMC = "qxbzmc";
	public static final String DWBM = "dwbm";
	public static final String DWMC = "dwmc";
	public static final String GWBM = "gwbm";
	public static final String GWMC = "gwmc";
	public static final String ZXZBM = "zxzbm";
	public static final String ZXZXM = "zxzxm";
	public static final String ZGZZLX = "zgzzlx";
	public static final String ZGZZBM = "zgzzbm";
	public static final String ZXDD = "zxdd";
	public static final String GDZXR = "gdzxr";
	public static final String CLJGBM = "cljgbm";
	public static final String CLJGMS = "cljgms";
	public static final String CLYJJD = "clyjjd";
	public static final String CLSX = "clsx";
	public static final String SYGZR = "sygzr";
	public static final String TQYCTS = "tqycts";
	public static final String BDBBZ = "bdbbz";
	public static final String CSMXZXBZ = "csmxzxbz";
	public static final String BZDYDWBM = "bzdydwbm";
	public static final String BZDYDWMC = "bzdydwmc";
	public static final String BZDYAGBM = "bzdyagbm";
	public static final String BZDYAGMC = "bzdyagmc";
	public static final String BZDYBGBM = "bzdybgbm";
	public static final String BZDYBGMC = "bzdybgmc";
	public static final String RWFPGWBM = "rwfpgwbm";
	public static final String RWFPGWMC = "rwfpgwmc";
	public static final String RWFPGWLX = "rwfpgwlx";
	public static final String QXSMBZ = "qxsmbz";
	public static final String RWZT = "rwzt";
	public static final String RWXLJF = "rwxljf";
	public static final String BZ = "bz";
	public static final String UP = "up";
	public static final String GQCNSX = "gqcnsx";
	public static final String GQBZ = "gqbz";
	public static final String ZTBZ = "ztbz";
	public static final String BOOKMARKNAME = "bookmarkname";
	public static final String SFYSB = "sfysb";

	protected void initDao() {
		// do nothing
	}

	public void save(BjLcclxx transientInstance) {
		log.debug("saving BjLcclxx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BjLcclxx persistentInstance) {
		log.debug("deleting BjLcclxx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BjLcclxx findById(java.lang.Long id) {
		log.debug("getting BjLcclxx instance with id: " + id);
		try {
			BjLcclxx instance = (BjLcclxx) getHibernateTemplate().get(
					"com.wechat.vo.BjLcclxx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BjLcclxx instance) {
		log.debug("finding BjLcclxx instance by example");
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
		log.debug("finding BjLcclxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BjLcclxx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBjlsh(Object bjlsh) {
		return findByProperty(BJLSH, bjlsh);
	}

	public List findBySxbm(Object sxbm) {
		return findByProperty(SXBM, sxbm);
	}

	public List findByBzbm(Object bzbm) {
		return findByProperty(BZBM, bzbm);
	}

	public List findByBzmc(Object bzmc) {
		return findByProperty(BZMC, bzmc);
	}

	public List findByBzlx(Object bzlx) {
		return findByProperty(BZLX, bzlx);
	}

	public List findByQxrwlsh(Object qxrwlsh) {
		return findByProperty(QXRWLSH, qxrwlsh);
	}

	public List findByQxbzbm(Object qxbzbm) {
		return findByProperty(QXBZBM, qxbzbm);
	}

	public List findByQxbzmc(Object qxbzmc) {
		return findByProperty(QXBZMC, qxbzmc);
	}

	public List findByDwbm(Object dwbm) {
		return findByProperty(DWBM, dwbm);
	}

	public List findByDwmc(Object dwmc) {
		return findByProperty(DWMC, dwmc);
	}

	public List findByGwbm(Object gwbm) {
		return findByProperty(GWBM, gwbm);
	}

	public List findByGwmc(Object gwmc) {
		return findByProperty(GWMC, gwmc);
	}

	public List findByZxzbm(Object zxzbm) {
		return findByProperty(ZXZBM, zxzbm);
	}

	public List findByZxzxm(Object zxzxm) {
		return findByProperty(ZXZXM, zxzxm);
	}

	public List findByZgzzlx(Object zgzzlx) {
		return findByProperty(ZGZZLX, zgzzlx);
	}

	public List findByZgzzbm(Object zgzzbm) {
		return findByProperty(ZGZZBM, zgzzbm);
	}

	public List findByZxdd(Object zxdd) {
		return findByProperty(ZXDD, zxdd);
	}

	public List findByGdzxr(Object gdzxr) {
		return findByProperty(GDZXR, gdzxr);
	}

	public List findByCljgbm(Object cljgbm) {
		return findByProperty(CLJGBM, cljgbm);
	}

	public List findByCljgms(Object cljgms) {
		return findByProperty(CLJGMS, cljgms);
	}

	public List findByClyjjd(Object clyjjd) {
		return findByProperty(CLYJJD, clyjjd);
	}

	public List findByClsx(Object clsx) {
		return findByProperty(CLSX, clsx);
	}

	public List findBySygzr(Object sygzr) {
		return findByProperty(SYGZR, sygzr);
	}

	public List findByTqycts(Object tqycts) {
		return findByProperty(TQYCTS, tqycts);
	}

	public List findByBdbbz(Object bdbbz) {
		return findByProperty(BDBBZ, bdbbz);
	}

	public List findByCsmxzxbz(Object csmxzxbz) {
		return findByProperty(CSMXZXBZ, csmxzxbz);
	}

	public List findByBzdydwbm(Object bzdydwbm) {
		return findByProperty(BZDYDWBM, bzdydwbm);
	}

	public List findByBzdydwmc(Object bzdydwmc) {
		return findByProperty(BZDYDWMC, bzdydwmc);
	}

	public List findByBzdyagbm(Object bzdyagbm) {
		return findByProperty(BZDYAGBM, bzdyagbm);
	}

	public List findByBzdyagmc(Object bzdyagmc) {
		return findByProperty(BZDYAGMC, bzdyagmc);
	}

	public List findByBzdybgbm(Object bzdybgbm) {
		return findByProperty(BZDYBGBM, bzdybgbm);
	}

	public List findByBzdybgmc(Object bzdybgmc) {
		return findByProperty(BZDYBGMC, bzdybgmc);
	}

	public List findByRwfpgwbm(Object rwfpgwbm) {
		return findByProperty(RWFPGWBM, rwfpgwbm);
	}

	public List findByRwfpgwmc(Object rwfpgwmc) {
		return findByProperty(RWFPGWMC, rwfpgwmc);
	}

	public List findByRwfpgwlx(Object rwfpgwlx) {
		return findByProperty(RWFPGWLX, rwfpgwlx);
	}

	public List findByQxsmbz(Object qxsmbz) {
		return findByProperty(QXSMBZ, qxsmbz);
	}

	public List findByRwzt(Object rwzt) {
		return findByProperty(RWZT, rwzt);
	}

	public List findByRwxljf(Object rwxljf) {
		return findByProperty(RWXLJF, rwxljf);
	}

	public List findByBz(Object bz) {
		return findByProperty(BZ, bz);
	}

	public List findByUp(Object up) {
		return findByProperty(UP, up);
	}

	public List findByGqcnsx(Object gqcnsx) {
		return findByProperty(GQCNSX, gqcnsx);
	}

	public List findByGqbz(Object gqbz) {
		return findByProperty(GQBZ, gqbz);
	}

	public List findByZtbz(Object ztbz) {
		return findByProperty(ZTBZ, ztbz);
	}

	public List findByBookmarkname(Object bookmarkname) {
		return findByProperty(BOOKMARKNAME, bookmarkname);
	}

	public List findBySfysb(Object sfysb) {
		return findByProperty(SFYSB, sfysb);
	}

	public List findAll() {
		log.debug("finding all BjLcclxx instances");
		try {
			String queryString = "from BjLcclxx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BjLcclxx merge(BjLcclxx detachedInstance) {
		log.debug("merging BjLcclxx instance");
		try {
			BjLcclxx result = (BjLcclxx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BjLcclxx instance) {
		log.debug("attaching dirty BjLcclxx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BjLcclxx instance) {
		log.debug("attaching clean BjLcclxx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BjLcclxxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BjLcclxxDAO) ctx.getBean("BjLcclxxDAO");
	}
}