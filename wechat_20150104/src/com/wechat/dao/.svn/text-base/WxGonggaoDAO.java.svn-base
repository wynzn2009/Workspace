package com.wechat.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wechat.vo.Newssave;
import com.wechat.vo.WxGonggao;

/**
 	* A data access object (DAO) providing persistence and search support for WxGonggao entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see com.wechat.dao.WxGonggao
  * @author MyEclipse Persistence Tools 
 */

public class WxGonggaoDAO extends HibernateDaoSupport  {
	     private static final Logger log = LoggerFactory.getLogger(WxGonggaoDAO.class);
		//property constants
	public static final String TITLE = "title";
	public static final String AUTHOR = "author";
	public static final String COVER = "cover";
	public static final String CONTENT = "content";



	protected void initDao() {
		//do nothing
	}
    
    public void save(WxGonggao transientInstance) {
        log.debug("saving WxGonggao instance");
        try {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(WxGonggao persistentInstance) {
        log.debug("deleting WxGonggao instance");
        try {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public WxGonggao findById( java.lang.Long id) {
        log.debug("getting WxGonggao instance with id: " + id);
        try {
            WxGonggao instance = (WxGonggao) getHibernateTemplate()
                    .get("com.wechat.vo.WxGonggao", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(WxGonggao instance) {
        log.debug("finding WxGonggao instance by example");
        try {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding WxGonggao instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from WxGonggao as model where model." 
         						+ propertyName + "= ?";
		 return getHibernateTemplate().find(queryString, value);
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByTitle(Object title
	) {
		return findByProperty(TITLE, title
		);
	}
	
	public List findByAuthor(Object author
	) {
		return findByProperty(AUTHOR, author
		);
	}
	
	public List findByCover(Object cover
	) {
		return findByProperty(COVER, cover
		);
	}
	
	public List findByContent(Object content
	) {
		return findByProperty(CONTENT, content
		);
	}
	

	public List findAll() {
		log.debug("finding all WxGonggao instances");
		try {
			String queryString = "from WxGonggao";
		 	return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public WxGonggao merge(WxGonggao detachedInstance) {
        log.debug("merging WxGonggao instance");
        try {
            WxGonggao result = (WxGonggao) getHibernateTemplate()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(WxGonggao instance) {
        log.debug("attaching dirty WxGonggao instance");
        try {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(WxGonggao instance) {
        log.debug("attaching clean WxGonggao instance");
        try {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

	public static WxGonggaoDAO getFromApplicationContext(ApplicationContext ctx) {
    	return (WxGonggaoDAO) ctx.getBean("WxGonggaoDAO");
	}
	
	//XSY 140919
	public List<WxGonggao> showTopten(){
		try {
			String hql = "from WxGonggao wxgg order by wxgg.time desc";
			getHibernateTemplate().setMaxResults(10);
			return getHibernateTemplate().find(hql);
		} catch (RuntimeException re) {
			System.out.println("error");
			log.error("find failed", re);
			throw re;
		}
	}
}