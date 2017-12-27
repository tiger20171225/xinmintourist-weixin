package com.lsy.pojo;

// Generated 2017-12-24 11:09:20 by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class MEmployees.
 * @see com.lsy.pojo.MEmployees
 * @author Hibernate Tools
 */
public class MEmployeesHome {

    private static final Log log = LogFactory.getLog(MEmployeesHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();

    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext()
                    .lookup("SessionFactory");
        } catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException(
                    "Could not locate SessionFactory in JNDI");
        }
    }

    public void persist(MEmployees transientInstance) {
        log.debug("persisting MEmployees instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        } catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }

    public void attachDirty(MEmployees instance) {
        log.debug("attaching dirty MEmployees instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

    public void attachClean(MEmployees instance) {
        log.debug("attaching clean MEmployees instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

    public void delete(MEmployees persistentInstance) {
        log.debug("deleting MEmployees instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }

    public MEmployees merge(MEmployees detachedInstance) {
        log.debug("merging MEmployees instance");
        try {
            MEmployees result = (MEmployees) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public MEmployees findById(java.lang.Integer id) {
        log.debug("getting MEmployees instance with id: " + id);
        try {
            MEmployees instance = (MEmployees) sessionFactory
                    .getCurrentSession().get("com.lsy.pojo.MEmployees", id);
            if (instance == null) {
                log.debug("get successful, no instance found");
            } else {
                log.debug("get successful, instance found");
            }
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }

    public List findByExample(MEmployees instance) {
        log.debug("finding MEmployees instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.lsy.pojo.MEmployees")
                    .add(Example.create(instance)).list();
            log.debug("find by example successful, result size: "
                    + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }
}
