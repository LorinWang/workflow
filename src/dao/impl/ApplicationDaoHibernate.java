package dao.impl;

import java.util.List;

import dao.ApplicationDao;
import domain.Application;
import domain.Employee;
import hibernate3.support.YeekuHibernateDaoSupport;

public class ApplicationDaoHibernate extends YeekuHibernateDaoSupport implements ApplicationDao
{

	@Override
	public Application get(Integer id)
	{
		return getHibernateTemplate().get(Application.class, id);
	}

	@Override
	public Integer save(Application applicaton)
	{
		return (Integer) getHibernateTemplate().save(applicaton);
	}

	@Override
	public void update(Application application)
	{
		getHibernateTemplate().update(application);
	}

	@Override
	public void delete(Application application)
	{
		getHibernateTemplate().delete(application);
	}

	@Override
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Application> findAll()
	{
		return (List<Application>) getHibernateTemplate().find("from Application");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Application> findByEmp(Employee emp)
	{
		return getHibernateTemplate().find("from Application as a where " + "a.attend,employee=?", emp);
	}

}
