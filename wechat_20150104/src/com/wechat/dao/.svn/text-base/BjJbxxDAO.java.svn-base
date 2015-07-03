package com.wechat.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.wechat.vo.*;

public class BjJbxxDAO extends BaseDAO {
	private static final Logger log = LoggerFactory.getLogger(BjJbxxDAO.class);
	// property constants
	public static final String SXBM = "sxbm";
	public static final String SXMC = "sxmc";
	public static final String SQZLX = "sqzlx";
	public static final String XQRXM = "xqrxm";
	public static final String XQRZJLX = "xqrzjlx";
	public static final String XQRZJHM = "xqrzjhm";
	public static final String SQDWMC = "sqdwmc";
	public static final String SQDWJGDM = "sqdwjgdm";
	public static final String SQDWDBR = "sqdwdbr";
	public static final String DZ = "dz";
	public static final String YB = "yb";
	public static final String DZYX = "dzyx";
	public static final String LXR = "lxr";
	public static final String LXDH = "lxdh";
	public static final String SJHM = "sjhm";
	public static final String CZHM = "czhm";
	public static final String WZ = "wz";
	public static final String SXCBJGBM = "sxcbjgbm";
	public static final String CBJGBM = "cbjgbm";
	public static final String CBJGMC = "cbjgmc";
	public static final String DSXZQHBM = "dsxzqhbm";
	public static final String DSMC = "dsmc";
	public static final String QXXZQHBM = "qxxzqhbm";
	public static final String QXMC = "qxmc";
	public static final String XZXZQHBM = "xzxzqhbm";
	public static final String XZMC = "xzmc";
	public static final String CNSX = "cnsx";
	public static final String BJJGMS = "bjjgms";
	public static final String BJZTBM = "bjztbm";
	public static final String BJZTMS = "bjztms";
	public static final String QJBZ = "qjbz";
	public static final String YL1 = "yl1";
	public static final String JCCS = "jccs";
	public static final String BQBZCS = "bqbzcs";
	public static final String YCJCBZZFC = "ycjcbzzfc";
	public static final String YL9 = "yl9";
	public static final String YL10 = "yl10";
	public static final String YL11 = "yl11";
	public static final String YL12 = "yl12";
	public static final String YL13 = "yl13";
	public static final String YL14 = "yl14";
	public static final String YL15 = "yl15";
	public static final String YL16 = "yl16";
	public static final String YL17 = "yl17";
	public static final String YL18 = "yl18";
	public static final String YL19 = "yl19";
	public static final String YL20 = "yl20";
	public static final String BJLY = "bjly";
	public static final String SFSM = "sfsm";
	public static final String SFR = "sfr";
	public static final String JFR = "jfr";
	public static final String SFDJ = "sfdj";
	public static final String SL = "sl";
	public static final String SFDHBZ = "sfdhbz";
	public static final String DHSM = "dhsm";
	public static final String BLSPRWJS = "blsprwjs";
	public static final String UP = "up";
	public static final String GQCNSX = "gqcnsx";
	public static final String ZTBZ = "ztbz";
	public static final String CFMS = "cfms";
	public static final String YZYCLBZ = "yzyclbz";
	public static final String BQZS = "bqzs";
	public static final String PASSNUM = "passnum";
	public static final String BJLYQD = "bjlyqd";
	public static final String YJJRXM = "yjjrxm";
	public static final String GWBM = "gwbm";
	public static final String FKXX = "fkxx";
	public static final String TQYCTS = "tqycts";
	public static final String YXTSBZ = "yxtsbz";
	public static final String TSGDLSH = "tsgdlsh";
	public static final String QXHGBZ = "qxhgbz";
	public static final String CLSJTJZ = "clsjtjz";
	public static final String JSCLSX = "jsclsx";
	public static final String JSCLXX = "jsclxx";
	public static final String JSCLZ = "jsclz";
	public static final String TJJLDW = "tjjldw";
	public static final String SJCLZ = "sjclz";
	public static final String SJCLDW = "sjcldw";
	public static final String BJSL = "bjsl";
	public static final String SFYJBZ = "sfyjbz";
	public static final String SLTJYJBZ = "sltjyjbz";
	public static final String LCHJYJBZ = "lchjyjbz";
	public static final String ZYCLYJBZ = "zyclyjbz";
	public static final String BJJGYJBZ = "bjjgyjbz";
	public static final String BJGZYJBZ = "bjgzyjbz";
	public static final String YJQXBZ = "yjqxbz";
	public static final String CKDZ = "ckdz";
	public static final String SQNR = "sqnr";
	public static final String JRSYGZR = "jrsygzr";
	public static final String SJSYTS = "sjsyts";
	public static final String SFSFBZ = "sfsfbz";
	public static final String SFJE = "sfje";
	public static final String XLJF = "xljf";
	public static final String ZZCLRWBM = "zzclrwbm";
	public static final String ZZCLRWMC = "zzclrwmc";
	public static final String QJRXM = "qjrxm";
	public static final String QJRLXDH = "qjrlxdh";
	public static final String HZCLYJ = "hzclyj";
	public static final String FZJCJGBZ = "fzjcjgbz";
	public static final String BBBZ = "bbbz";
	public static final String CGBZ = "cgbz";
	public static final String CKPJQJG = "ckpjqjg";
	public static final String YL2 = "yl2";
	public static final String YL3 = "yl3";
	public static final String YL5 = "yl5";
	public static final String YL6 = "yl6";
	public static final String ZHXGRY = "zhxgry";
	public static final String YHXX = "yhxx";
	public static final String ZT = "zt";

	protected void initDao() {
		// do nothing
	}

	public void save(BjJbxx transientInstance) {
		log.debug("saving BjJbxx instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BjJbxx persistentInstance) {
		log.debug("deleting BjJbxx instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BjJbxx findByBjlsh(String bjlsh) {
		log.debug("finding BjJbxx instance by example");
		try {
			BjJbxx instance = (BjJbxx) getHibernateTemplate().get(
					"com.wechat.vo.BjJbxx", bjlsh);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BjJbxx instance) {
		log.debug("finding BjJbxx instance by example");
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
		log.debug("finding BjJbxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BjJbxx as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySxbm(Object sxbm) {
		return findByProperty(SXBM, sxbm);
	}

	public List findBySxmc(Object sxmc) {
		return findByProperty(SXMC, sxmc);
	}

	public List findBySqzlx(Object sqzlx) {
		return findByProperty(SQZLX, sqzlx);
	}

	public List findByXqrxm(Object xqrxm) {
		return findByProperty(XQRXM, xqrxm);
	}

	public List findByXqrzjlx(Object xqrzjlx) {
		return findByProperty(XQRZJLX, xqrzjlx);
	}

	public List findByXqrzjhm(Object xqrzjhm) {
		return findByProperty(XQRZJHM, xqrzjhm);
	}

	public List findBySqdwmc(Object sqdwmc) {
		return findByProperty(SQDWMC, sqdwmc);
	}

	public List findBySqdwjgdm(Object sqdwjgdm) {
		return findByProperty(SQDWJGDM, sqdwjgdm);
	}

	public List findBySqdwdbr(Object sqdwdbr) {
		return findByProperty(SQDWDBR, sqdwdbr);
	}

	public List findByDz(Object dz) {
		return findByProperty(DZ, dz);
	}

	public List findByYb(Object yb) {
		return findByProperty(YB, yb);
	}

	public List findByDzyx(Object dzyx) {
		return findByProperty(DZYX, dzyx);
	}

	public List findByLxr(Object lxr) {
		return findByProperty(LXR, lxr);
	}

	public List findByLxdh(Object lxdh) {
		return findByProperty(LXDH, lxdh);
	}

	public List findBySjhm(Object sjhm) {
		return findByProperty(SJHM, sjhm);
	}

	public List findByCzhm(Object czhm) {
		return findByProperty(CZHM, czhm);
	}

	public List findByWz(Object wz) {
		return findByProperty(WZ, wz);
	}

	public List findBySxcbjgbm(Object sxcbjgbm) {
		return findByProperty(SXCBJGBM, sxcbjgbm);
	}

	public List findByCbjgbm(Object cbjgbm) {
		return findByProperty(CBJGBM, cbjgbm);
	}

	public List findByCbjgmc(Object cbjgmc) {
		return findByProperty(CBJGMC, cbjgmc);
	}

	public List findByDsxzqhbm(Object dsxzqhbm) {
		return findByProperty(DSXZQHBM, dsxzqhbm);
	}

	public List findByDsmc(Object dsmc) {
		return findByProperty(DSMC, dsmc);
	}

	public List findByQxxzqhbm(Object qxxzqhbm) {
		return findByProperty(QXXZQHBM, qxxzqhbm);
	}

	public List findByQxmc(Object qxmc) {
		return findByProperty(QXMC, qxmc);
	}

	public List findByXzxzqhbm(Object xzxzqhbm) {
		return findByProperty(XZXZQHBM, xzxzqhbm);
	}

	public List findByXzmc(Object xzmc) {
		return findByProperty(XZMC, xzmc);
	}

	public List findByCnsx(Object cnsx) {
		return findByProperty(CNSX, cnsx);
	}

	public List findByBjjgms(Object bjjgms) {
		return findByProperty(BJJGMS, bjjgms);
	}

	public List findByBjztbm(Object bjztbm) {
		return findByProperty(BJZTBM, bjztbm);
	}

	public List findByBjztms(Object bjztms) {
		return findByProperty(BJZTMS, bjztms);
	}

	public List findByQjbz(Object qjbz) {
		return findByProperty(QJBZ, qjbz);
	}

	public List findByYl1(Object yl1) {
		return findByProperty(YL1, yl1);
	}

	public List findByJccs(Object jccs) {
		return findByProperty(JCCS, jccs);
	}

	public List findByBqbzcs(Object bqbzcs) {
		return findByProperty(BQBZCS, bqbzcs);
	}

	public List findByYcjcbzzfc(Object ycjcbzzfc) {
		return findByProperty(YCJCBZZFC, ycjcbzzfc);
	}

	public List findByYl9(Object yl9) {
		return findByProperty(YL9, yl9);
	}

	public List findByYl10(Object yl10) {
		return findByProperty(YL10, yl10);
	}

	public List findByYl11(Object yl11) {
		return findByProperty(YL11, yl11);
	}

	public List findByYl12(Object yl12) {
		return findByProperty(YL12, yl12);
	}

	public List findByYl13(Object yl13) {
		return findByProperty(YL13, yl13);
	}

	public List findByYl14(Object yl14) {
		return findByProperty(YL14, yl14);
	}

	public List findByYl15(Object yl15) {
		return findByProperty(YL15, yl15);
	}

	public List findByYl16(Object yl16) {
		return findByProperty(YL16, yl16);
	}

	public List findByYl17(Object yl17) {
		return findByProperty(YL17, yl17);
	}

	public List findByYl18(Object yl18) {
		return findByProperty(YL18, yl18);
	}

	public List findByYl19(Object yl19) {
		return findByProperty(YL19, yl19);
	}

	public List findByYl20(Object yl20) {
		return findByProperty(YL20, yl20);
	}

	public List findByBjly(Object bjly) {
		return findByProperty(BJLY, bjly);
	}

	public List findBySfsm(Object sfsm) {
		return findByProperty(SFSM, sfsm);
	}

	public List findBySfr(Object sfr) {
		return findByProperty(SFR, sfr);
	}

	public List findByJfr(Object jfr) {
		return findByProperty(JFR, jfr);
	}

	public List findBySfdj(Object sfdj) {
		return findByProperty(SFDJ, sfdj);
	}

	public List findBySl(Object sl) {
		return findByProperty(SL, sl);
	}

	public List findBySfdhbz(Object sfdhbz) {
		return findByProperty(SFDHBZ, sfdhbz);
	}

	public List findByDhsm(Object dhsm) {
		return findByProperty(DHSM, dhsm);
	}

	public List findByBlsprwjs(Object blsprwjs) {
		return findByProperty(BLSPRWJS, blsprwjs);
	}

	public List findByUp(Object up) {
		return findByProperty(UP, up);
	}

	public List findByGqcnsx(Object gqcnsx) {
		return findByProperty(GQCNSX, gqcnsx);
	}

	public List findByZtbz(Object ztbz) {
		return findByProperty(ZTBZ, ztbz);
	}

	public List findByCfms(Object cfms) {
		return findByProperty(CFMS, cfms);
	}

	public List findByYzyclbz(Object yzyclbz) {
		return findByProperty(YZYCLBZ, yzyclbz);
	}

	public List findByBqzs(Object bqzs) {
		return findByProperty(BQZS, bqzs);
	}

	public List findByPassnum(Object passnum) {
		return findByProperty(PASSNUM, passnum);
	}

	public List findByBjlyqd(Object bjlyqd) {
		return findByProperty(BJLYQD, bjlyqd);
	}

	public List findByYjjrxm(Object yjjrxm) {
		return findByProperty(YJJRXM, yjjrxm);
	}

	public List findByGwbm(Object gwbm) {
		return findByProperty(GWBM, gwbm);
	}

	public List findByFkxx(Object fkxx) {
		return findByProperty(FKXX, fkxx);
	}

	public List findByTqycts(Object tqycts) {
		return findByProperty(TQYCTS, tqycts);
	}

	public List findByYxtsbz(Object yxtsbz) {
		return findByProperty(YXTSBZ, yxtsbz);
	}

	public List findByTsgdlsh(Object tsgdlsh) {
		return findByProperty(TSGDLSH, tsgdlsh);
	}

	public List findByQxhgbz(Object qxhgbz) {
		return findByProperty(QXHGBZ, qxhgbz);
	}

	public List findByClsjtjz(Object clsjtjz) {
		return findByProperty(CLSJTJZ, clsjtjz);
	}

	public List findByJsclsx(Object jsclsx) {
		return findByProperty(JSCLSX, jsclsx);
	}

	public List findByJsclxx(Object jsclxx) {
		return findByProperty(JSCLXX, jsclxx);
	}

	public List findByJsclz(Object jsclz) {
		return findByProperty(JSCLZ, jsclz);
	}

	public List findByTjjldw(Object tjjldw) {
		return findByProperty(TJJLDW, tjjldw);
	}

	public List findBySjclz(Object sjclz) {
		return findByProperty(SJCLZ, sjclz);
	}

	public List findBySjcldw(Object sjcldw) {
		return findByProperty(SJCLDW, sjcldw);
	}

	public List findByBjsl(Object bjsl) {
		return findByProperty(BJSL, bjsl);
	}

	public List findBySfyjbz(Object sfyjbz) {
		return findByProperty(SFYJBZ, sfyjbz);
	}

	public List findBySltjyjbz(Object sltjyjbz) {
		return findByProperty(SLTJYJBZ, sltjyjbz);
	}

	public List findByLchjyjbz(Object lchjyjbz) {
		return findByProperty(LCHJYJBZ, lchjyjbz);
	}

	public List findByZyclyjbz(Object zyclyjbz) {
		return findByProperty(ZYCLYJBZ, zyclyjbz);
	}

	public List findByBjjgyjbz(Object bjjgyjbz) {
		return findByProperty(BJJGYJBZ, bjjgyjbz);
	}

	public List findByBjgzyjbz(Object bjgzyjbz) {
		return findByProperty(BJGZYJBZ, bjgzyjbz);
	}

	public List findByYjqxbz(Object yjqxbz) {
		return findByProperty(YJQXBZ, yjqxbz);
	}

	public List findByCkdz(Object ckdz) {
		return findByProperty(CKDZ, ckdz);
	}

	public List findBySqnr(Object sqnr) {
		return findByProperty(SQNR, sqnr);
	}

	public List findByJrsygzr(Object jrsygzr) {
		return findByProperty(JRSYGZR, jrsygzr);
	}

	public List findBySjsyts(Object sjsyts) {
		return findByProperty(SJSYTS, sjsyts);
	}

	public List findBySfsfbz(Object sfsfbz) {
		return findByProperty(SFSFBZ, sfsfbz);
	}

	public List findBySfje(Object sfje) {
		return findByProperty(SFJE, sfje);
	}

	public List findByXljf(Object xljf) {
		return findByProperty(XLJF, xljf);
	}

	public List findByZzclrwbm(Object zzclrwbm) {
		return findByProperty(ZZCLRWBM, zzclrwbm);
	}

	public List findByZzclrwmc(Object zzclrwmc) {
		return findByProperty(ZZCLRWMC, zzclrwmc);
	}

	public List findByQjrxm(Object qjrxm) {
		return findByProperty(QJRXM, qjrxm);
	}

	public List findByQjrlxdh(Object qjrlxdh) {
		return findByProperty(QJRLXDH, qjrlxdh);
	}

	public List findByHzclyj(Object hzclyj) {
		return findByProperty(HZCLYJ, hzclyj);
	}

	public List findByFzjcjgbz(Object fzjcjgbz) {
		return findByProperty(FZJCJGBZ, fzjcjgbz);
	}

	public List findByBbbz(Object bbbz) {
		return findByProperty(BBBZ, bbbz);
	}

	public List findByCgbz(Object cgbz) {
		return findByProperty(CGBZ, cgbz);
	}

	public List findByCkpjqjg(Object ckpjqjg) {
		return findByProperty(CKPJQJG, ckpjqjg);
	}

	public List findByYl2(Object yl2) {
		return findByProperty(YL2, yl2);
	}

	public List findByYl3(Object yl3) {
		return findByProperty(YL3, yl3);
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

	public List findByYhxx(Object yhxx) {
		return findByProperty(YHXX, yhxx);
	}

	public List findByZt(Object zt) {
		return findByProperty(ZT, zt);
	}

	public List findAll() {
		log.debug("finding all BjJbxx instances");
		try {
			String queryString = "from BjJbxx";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BjJbxx merge(BjJbxx detachedInstance) {
		log.debug("merging BjJbxx instance");
		try {
			BjJbxx result = (BjJbxx) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BjJbxx instance) {
		log.debug("attaching dirty BjJbxx instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BjJbxx instance) {
		log.debug("attaching clean BjJbxx instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BjJbxxDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BjJbxxDAO) ctx.getBean("BjJbxxDAO");
	}
//own	
	 public List searchByLxdh(String lxdh){
		 try{
		 System.out.println("sql");
		 String sql="select * from BJ_JBXX WHERE LXDH="+"'"+lxdh+"'";
		 List list=execSQLQuery(sql);
		 return list;
		 /*
	     System.out.println("hql");
	     String hql="select * from BjJbxx bjjbxx where bjjbxx.lxdh='"+lxdh+"'";
	     List list=HQLQuery(hql,new Object[]{lxdh});
	     return list;
		 */
		 }catch(Exception e){
			 System.out.println("wrong");
		 }
		 return null;
	}
	//查找函数
	public List find1(String lxdh) {
		try{
			 System.out.println("sql");
			 String sql="select * from BJ_JBXX WHERE LXDH="+"'"+lxdh+"'";
			 List list=execSQLQuery(sql);
			 return list;
			 }catch(Exception e){
				 System.out.println("wrong");
			 }
			 return null;
	}
	/**
	 * 找到正在流转的办件
	 * @param bjlsh
	 * @param sxmc
	 * @param sqz
	 * @param lxdh
	 * @return
	 */
	public List<BjLcclxx> findBj(String bjlsh,String sxmc,String sqz,String lxdh){
		DetachedCriteria dc1 = DetachedCriteria.forClass(BjJbxx.class);
		DetachedCriteria dc2 = DetachedCriteria.forClass(BjLcclxx.class);
		List<BjLcclxx> list=null;
		try{
			if(lxdh!=null&&!lxdh.equals("")){
				dc1.add(Restrictions.eq("lxdh",lxdh));
			}
			if(sxmc!=null&&sxmc!="")
			{
				dc1.add(Restrictions.eq("sxmc",sxmc));
			}
			if(sqz!=null&&sqz!="")
			{
				dc1.add(Restrictions.or(
						Restrictions.eq("sqdwdbr", sqz),Restrictions.or(
								Restrictions.eq("sqdwmc",sqz),Restrictions.eq("xqrxm",sqz))));
			}
			if(bjlsh!=null&&!bjlsh.equals("")){
				dc1.add(Restrictions.eq("bjlsh",bjlsh));
			}
			dc1.setProjection(Property.forName("bjlsh"));
			dc2.add(Subqueries.propertyIn("bjlsh", dc1))
	          .add(Restrictions.eq("rwzt", "处理中"));
			list=getHibernateTemplate().findByCriteria(dc2);
			
		}catch(Exception e){
		    e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 找到正在流转的办件
	 * @param bjlsh(like %)
	 * @param sqz
	 * @param lxdh
	 * @return
	 */
	public List<BjJbxx> findBj2(String bjlsh,String sqz,String lxdh){
		log.debug("finding Bjjbxx by bjlsh and sqz and lxdh.");
		try {
			String bjlshString = "%" + bjlsh + "%";
			String sqzString = "%" + sqz +"%";
			String lxdhString = "%" + lxdh + "%";
			String queryString = "from BjJbxx as model where model.bjlsh like ? and model.xqrxm like ? and model.lxdh like ?" ;
			return getHibernateTemplate().find(queryString,new String[]{bjlshString,sqzString,lxdhString});
			
		} catch (RuntimeException re) {
			log.error("find by property fbbz and type failed", re);
			throw re;
		}
	}
}

   