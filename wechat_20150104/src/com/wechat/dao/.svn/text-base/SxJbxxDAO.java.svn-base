package com.wechat.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.wechat.vo.*;

/**
 * A data access object (DAO) providing persistence and search support for
 * SxJbxx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wechat.dao.SxJbxx
 * @author MyEclipse Persistence Tools
 */

public class SxJbxxDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SxJbxxDAO.class);
	// property constants
	public static final String SXBM = "sxbm";
	public static final String SXMC = "sxmc";
	public static final String CBJGMB = "cbjgmb";
	public static final String CBJGMC = "cbjgmc";
	public static final String DSXZQHBM = "dsxzqhbm";
	public static final String DSMC = "dsmc";
	public static final String QXXZQHBM = "qxxzqhbm";
	public static final String QXMC = "qxmc";
	public static final String XZXZQHBM = "xzxzqhbm";
	public static final String XZMC = "xzmc";
	public static final String SXLBBM = "sxlbbm";
	public static final String SXLBMC = "sxlbmc";
	public static final String SXLXBM = "sxlxbm";
	public static final String SXLXMC = "sxlxmc";
	public static final String QLLXBM = "qllxbm";
	public static final String QLLXMC = "qllxmc";
	public static final String SXTZBM1 = "sxtzbm1";
	public static final String SXTZMS1 = "sxtzms1";
	public static final String XSXXH = "xsxxh";
	public static final String CNSX = "cnsx";
	public static final String FDSXXX = "fdsxxx";
	public static final String FDSXXSX = "fdsxxsx";
	public static final String SXSM = "sxsm";
	public static final String CGJKBZ = "cgjkbz";
	public static final String RZDTBZ = "rzdtbz";
	public static final String BMSXBZ = "bmsxbz";
	public static final String WSYSBZ = "wsysbz";
	public static final String YXDLBZ = "yxdlbz";
	public static final String BLSPBZ = "blspbz";
	public static final String NBSPBZ = "nbspbz";
	public static final String XZHKBZ = "xzhkbz";
	public static final String DTJKCK = "dtjkck";
	public static final String SXBBH = "sxbbh";
	public static final String SXQZTJ = "sxqztj";
	public static final String WBLCMS = "wblcms";
	public static final String NBLCMS = "nblcms";
	public static final String SFSFBZ = "sfsfbz";
	public static final String SFBZMS = "sfbzms";
	public static final String LXRXM = "lxrxm";
	public static final String LXRDH = "lxrdh";
	public static final String LXRSJHM = "lxrsjhm";
	public static final String LXRCZ = "lxrcz";
	public static final String LXRYZBM = "lxryzbm";
	public static final String LXDZ = "lxdz";
	public static final String LXRDZYJ = "lxrdzyj";
	public static final String LRRXM = "lrrxm";
	public static final String LRRDWMC = "lrrdwmc";
	public static final String TSDH = "tsdh";
	public static final String SXZTBM = "sxztbm";
	public static final String SXZTMC = "sxztmc";
	public static final String JCGDSL = "jcgdsl";
	public static final String LZFXDJ = "lzfxdj";
	public static final String LZFXDMS = "lzfxdms";
	public static final String LZFXDSL = "lzfxdsl";
	public static final String FXFFCS = "fxffcs";
	public static final String FXFFCSSL = "fxffcssl";
	public static final String FXGLCS = "fxglcs";
	public static final String BDZDYS = "bdzdys";
	public static final String SFYJGKBZ = "sfyjgkbz";
	public static final String SXGKXS = "sxgkxs";
	public static final String BZ = "bz";
	public static final String YL1 = "yl1";
	public static final String YL2 = "yl2";
	public static final String YL3 = "yl3";
	public static final String YL4 = "yl4";
	public static final String YL5 = "yl5";
	public static final String YL6 = "yl6";
	public static final String ZHXGRY = "zhxgry";
	public static final String LCMBBM = "lcmbbm";
	public static final String YXXZYJJBZ = "yxxzyjjbz";
	public static final String SFJE = "sfje";
	public static final String SFGSBJBZ = "sfgsbjbz";
	public static final String SFDJ = "sfdj";
	public static final String UP = "up";
	public static final String WWYJJBZ = "wwyjjbz";
	public static final String MRCLXX = "mrclxx";
	public static final String MRCLSX = "mrclsx";
	public static final String SFBQBZ = "sfbqbz";
	public static final String PASSNUMNEED = "passnumneed";
	public static final String SXSBFLBM = "sxsbflbm";
	public static final String KXZBGLJ = "kxzbglj";
	public static final String KJBPBZ = "kjbpbz";
	public static final String KJSBBZ = "kjsbbz";
	public static final String RSXX = "rsxx";
	public static final String TYL = "tyl";
	public static final String SFJTBJ = "sfjtbj";
	public static final String SJSXBM = "sjsxbm";
	public static final String SJGWBM = "sjgwbm";
	public static final String SFFBWW = "sffbww";

	protected void initDao() {
		// do nothing
	}

	public void save(SxJbxx transientInstance) {
		log.debug("saving SxJbxx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SxJbxx persistentInstance) {
		log.debug("deleting SxJbxx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SxJbxx findById(java.lang.String id) {
		log.debug("getting SxJbxx instance with id: " + id);
		try {
			SxJbxx instance = (SxJbxx) getHibernateTemplate().get(
					"com.wechat.vo.SxJbxx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<?> findByExample(SxJbxx instance) {
		log.debug("finding SxJbxx instance by example");
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
		log.debug("finding SxJbxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SxJbxx as model where model."
					+ propertyName + "= ?" + " order by sxmc asc";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<?> findByCbjgmc(Object cbjgmc) {
		return findByProperty(CBJGMC, cbjgmc);
	}

	public List<?> findAll() {
		log.debug("finding all SxJbxx instances");
		try {
			String queryString = "from SxJbxx as model order by model.cbjgmc asc, model.sxmc asc";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SxJbxx merge(SxJbxx detachedInstance) {
		log.debug("merging SxJbxx instance");
		try {
			SxJbxx result = (SxJbxx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SxJbxx instance) {
		log.debug("attaching dirty SxJbxx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SxJbxx instance) {
		log.debug("attaching clean SxJbxx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SxJbxxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SxJbxxDAO) ctx.getBean("SxJbxxDAO");
	}
	
	public List<?> findByCbjgmc(Object cbjgmc, int startRow, int endRow) {
		log.debug("finding findByCbjgmc instances");
		try{
			DetachedCriteria criteria = DetachedCriteria.forClass(SxJbxx.class);
			criteria.addOrder(Order.asc(SXBM));
			if(cbjgmc != null){
				criteria.add(Restrictions.eq(CBJGMC, cbjgmc));
			}
			return getHibernateTemplate().findByCriteria(criteria, startRow, endRow);
		}catch(RuntimeException re){
			log.error("findByCbjgmc failed", re);
			throw re;
		}
	}
	
	public int getTotalCount(String cbjgmc){
		log.debug("getTotalCount instances");
		try{
			String queryStr = "select count(*) from SxJbxx "+(cbjgmc==null?"":"where cbjgmc='"+cbjgmc+"'");
			List<?> list = getHibernateTemplate().find(queryStr);
			Object o = list.get(0);
			return Integer.parseInt(String.valueOf(o));
		}catch(RuntimeException re){
			log.error("getTotalCount failed", re);
			throw re;
		}
	}
}