package com.wechat.dao;

import java.sql.Timestamp;
import java.util.List;
import javax.sql.DataSource;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.wechat.vo.*;

/**
 * A data access object (DAO) providing persistence and search support for Tsxx
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wechat.dao.Tsxx
 * @author MyEclipse Persistence Tools
 */

public class TsxxDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(TsxxDAO.class);
	
	private DataSource dataSource;
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	// property constants
	public static final String TSBJLSH = "tsbjlsh";
	public static final String TSSXBM = "tssxbm";
	public static final String TSSXMC = "tssxmc";
	public static final String TSQDBM = "tsqdbm";
	public static final String TSQDMC = "tsqdmc";
	public static final String TSRXM = "tsrxm";
	public static final String TSRDWMC = "tsrdwmc";
	public static final String TSRZJHM = "tsrzjhm";
	public static final String TSRLXDZ = "tsrlxdz";
	public static final String TSRLXDH = "tsrlxdh";
	public static final String TSRYZBM = "tsryzbm";
	public static final String TSRDZYJ = "tsrdzyj";
	public static final String BTSBMBM = "btsbmbm";
	public static final String BTSBMMC = "btsbmmc";
	public static final String BRSRXM = "brsrxm";
	public static final String BTSBJLSH = "btsbjlsh";
	public static final String XWCLBMBM = "xwclbmbm";
	public static final String XWCLBMMC = "xwclbmmc";
	public static final String TSBT = "tsbt";
	public static final String TSLX = "tslx";
	public static final String TSNR = "tsnr";
	public static final String CXMM = "cxmm";
	public static final String TSJSBMBM = "tsjsbmbm";
	public static final String TSJSBMMC = "tsjsbmmc";
	public static final String TSJSGWBM = "tsjsgwbm";
	public static final String TSJSGWMC = "tsjsgwmc";
	public static final String TSJSRXM = "tsjsrxm";
	public static final String CNCLSX = "cnclsx";
	public static final String SJCLBMBM = "sjclbmbm";
	public static final String SJCLBMMC = "sjclbmmc";
	public static final String SJCLGWBM = "sjclgwbm";
	public static final String SJCLGWMC = "sjclgwmc";
	public static final String SJCLRXM = "sjclrxm";
	public static final String YXTSBZ = "yxtsbz";
	public static final String BJZT = "bjzt";
	public static final String CLJGJL = "cljgjl";
	public static final String YL1 = "yl1";
	public static final String YL2 = "yl2";
	public static final String YL3 = "yl3";
	public static final String YL4 = "yl4";
	public static final String YL5 = "yl5";
	public static final String YL6 = "yl6";
	public static final String ZHXGRY = "zhxgry";
	public static final String TSRXB = "tsrxb";
	public static final String TSRMZ = "tsrmz";
	public static final String TSRZZMM = "tsrzzmm";
	public static final String TSRDQ = "tsrdq";
	public static final String TSRZW = "tsrzw";
	public static final String BTSRXB = "btsrxb";
	public static final String BTSRLXDZ = "btsrlxdz";
	public static final String BTSRMZ = "btsrmz";
	public static final String BTSRZZMM = "btsrzzmm";
	public static final String BTSRJB = "btsrjb";
	public static final String BTSRZW = "btsrzw";
	public static final String BTSRTSSF = "btsrtssf";
	public static final String BTSRDQ = "btsrdq";
	public static final String USERID = "userid";

	protected void initDao() {
		// do nothing
	}

	public void save(Tsxx transientInstance) {
		log.debug("saving Tsxx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tsxx persistentInstance) {
		log.debug("deleting Tsxx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tsxx findById(java.lang.String id) {
		log.debug("getting Tsxx instance with id: " + id);
		try {
			Tsxx instance = (Tsxx) getHibernateTemplate().get(
					"com.wechat.dao.Tsxx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tsxx instance) {
		log.debug("finding Tsxx instance by example");
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
		log.debug("finding Tsxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tsxx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List finByTsbjlsh(Object tsbjlsh){
		return findByProperty(TSBJLSH, tsbjlsh);
	}
	public List findByTssxbm(Object tssxbm) {
		return findByProperty(TSSXBM, tssxbm);
	}

	public List findByTssxmc(Object tssxmc) {
		return findByProperty(TSSXMC, tssxmc);
	}

	public List findByTsqdbm(Object tsqdbm) {
		return findByProperty(TSQDBM, tsqdbm);
	}

	public List findByTsqdmc(Object tsqdmc) {
		return findByProperty(TSQDMC, tsqdmc);
	}

	public List findByTsrxm(Object tsrxm) {
		return findByProperty(TSRXM, tsrxm);
	}

	public List findByTsrdwmc(Object tsrdwmc) {
		return findByProperty(TSRDWMC, tsrdwmc);
	}

	public List findByTsrzjhm(Object tsrzjhm) {
		return findByProperty(TSRZJHM, tsrzjhm);
	}

	public List findByTsrlxdz(Object tsrlxdz) {
		return findByProperty(TSRLXDZ, tsrlxdz);
	}

	public List findByTsrlxdh(Object tsrlxdh) {
		return findByProperty(TSRLXDH, tsrlxdh);
	}

	public List findByTsryzbm(Object tsryzbm) {
		return findByProperty(TSRYZBM, tsryzbm);
	}

	public List findByTsrdzyj(Object tsrdzyj) {
		return findByProperty(TSRDZYJ, tsrdzyj);
	}

	public List findByBtsbmbm(Object btsbmbm) {
		return findByProperty(BTSBMBM, btsbmbm);
	}

	public List findByBtsbmmc(Object btsbmmc) {
		return findByProperty(BTSBMMC, btsbmmc);
	}

	public List findByBrsrxm(Object brsrxm) {
		return findByProperty(BRSRXM, brsrxm);
	}

	public List findByBtsbjlsh(Object btsbjlsh) {
		return findByProperty(BTSBJLSH, btsbjlsh);
	}

	public List findByXwclbmbm(Object xwclbmbm) {
		return findByProperty(XWCLBMBM, xwclbmbm);
	}

	public List findByXwclbmmc(Object xwclbmmc) {
		return findByProperty(XWCLBMMC, xwclbmmc);
	}

	public List findByTsbt(Object tsbt) {
		return findByProperty(TSBT, tsbt);
	}

	public List findByTslx(Object tslx) {
		return findByProperty(TSLX, tslx);
	}

	public List findByTsnr(Object tsnr) {
		return findByProperty(TSNR, tsnr);
	}

	public List findByCxmm(Object cxmm) {
		return findByProperty(CXMM, cxmm);
	}

	public List findByTsjsbmbm(Object tsjsbmbm) {
		return findByProperty(TSJSBMBM, tsjsbmbm);
	}

	public List findByTsjsbmmc(Object tsjsbmmc) {
		return findByProperty(TSJSBMMC, tsjsbmmc);
	}

	public List findByTsjsgwbm(Object tsjsgwbm) {
		return findByProperty(TSJSGWBM, tsjsgwbm);
	}

	public List findByTsjsgwmc(Object tsjsgwmc) {
		return findByProperty(TSJSGWMC, tsjsgwmc);
	}

	public List findByTsjsrxm(Object tsjsrxm) {
		return findByProperty(TSJSRXM, tsjsrxm);
	}

	public List findByCnclsx(Object cnclsx) {
		return findByProperty(CNCLSX, cnclsx);
	}

	public List findBySjclbmbm(Object sjclbmbm) {
		return findByProperty(SJCLBMBM, sjclbmbm);
	}

	public List findBySjclbmmc(Object sjclbmmc) {
		return findByProperty(SJCLBMMC, sjclbmmc);
	}

	public List findBySjclgwbm(Object sjclgwbm) {
		return findByProperty(SJCLGWBM, sjclgwbm);
	}

	public List findBySjclgwmc(Object sjclgwmc) {
		return findByProperty(SJCLGWMC, sjclgwmc);
	}

	public List findBySjclrxm(Object sjclrxm) {
		return findByProperty(SJCLRXM, sjclrxm);
	}

	public List findByYxtsbz(Object yxtsbz) {
		return findByProperty(YXTSBZ, yxtsbz);
	}

	public List findByBjzt(Object bjzt) {
		return findByProperty(BJZT, bjzt);
	}

	public List findByCljgjl(Object cljgjl) {
		return findByProperty(CLJGJL, cljgjl);
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

	public List findByYl4(Object yl4) {
		return findByProperty(YL4, yl4);
	}

	public List findByYl5(Object yl5) {
		return findByProperty(YL5, yl5);
	}

	public List findByYl6(Object yl6) {
		return findByProperty(YL6, yl6);
	}

	public List findByZhxgry(Object zhxgry) {
		return findByProperty(ZHXGRY, zhxgry);
	}

	public List findByTsrxb(Object tsrxb) {
		return findByProperty(TSRXB, tsrxb);
	}

	public List findByTsrmz(Object tsrmz) {
		return findByProperty(TSRMZ, tsrmz);
	}

	public List findByTsrzzmm(Object tsrzzmm) {
		return findByProperty(TSRZZMM, tsrzzmm);
	}

	public List findByTsrdq(Object tsrdq) {
		return findByProperty(TSRDQ, tsrdq);
	}

	public List findByTsrzw(Object tsrzw) {
		return findByProperty(TSRZW, tsrzw);
	}

	public List findByBtsrxb(Object btsrxb) {
		return findByProperty(BTSRXB, btsrxb);
	}

	public List findByBtsrlxdz(Object btsrlxdz) {
		return findByProperty(BTSRLXDZ, btsrlxdz);
	}

	public List findByBtsrmz(Object btsrmz) {
		return findByProperty(BTSRMZ, btsrmz);
	}

	public List findByBtsrzzmm(Object btsrzzmm) {
		return findByProperty(BTSRZZMM, btsrzzmm);
	}

	public List findByBtsrjb(Object btsrjb) {
		return findByProperty(BTSRJB, btsrjb);
	}

	public List findByBtsrzw(Object btsrzw) {
		return findByProperty(BTSRZW, btsrzw);
	}

	public List findByBtsrtssf(Object btsrtssf) {
		return findByProperty(BTSRTSSF, btsrtssf);
	}

	public List findByBtsrdq(Object btsrdq) {
		return findByProperty(BTSRDQ, btsrdq);
	}

	public List findByUserid(Object userid) {
		return findByProperty(USERID, userid);
	}

	public List findAll() {
		log.debug("finding all Tsxx instances");
		try {
			String queryString = "from Tsxx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tsxx merge(Tsxx detachedInstance) {
		log.debug("merging Tsxx instance");
		try {
			Tsxx result = (Tsxx) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tsxx instance) {
		log.debug("attaching dirty Tsxx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tsxx instance) {
		log.debug("attaching clean Tsxx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TsxxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TsxxDAO) ctx.getBean("TsxxDAO");
	}
	
	public String getMaxBjlsh(String dateStr){
		 JdbcTemplate jt = new JdbcTemplate(this.dataSource);
		 return (String)jt.queryForObject("select max(tsbjlsh) from tsxx where tsbjlsh like ?",
				 new Object[]{dateStr+"%"}, 
				 String.class);
	}
	/**
	 * 根据流水号和查询密码查询
	 * @param bjlsh
	 * @param psd
	 * @return
	 */
	public List<Tsxx> findByLsh(String bjlsh,String psd){
		log.debug("finding bj by txbjlsh and cxmm");
		try {
			String queryString = "from Tsxx as model where model.tsbjlsh = ? and model.cxmm = ?";
			return getHibernateTemplate().find(queryString,new String[]{bjlsh,psd});
			
		} catch (RuntimeException re) {
			log.error("find by property failed", re);
			throw re;
		}
	}
}