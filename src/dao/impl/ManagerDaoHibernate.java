package dao.impl;

import hibernate3.support.YeekuHibernateDaoSupport;

import java.util.List;

import dao.ManagerDao;
import domain.Manager;

public class ManagerDaoHibernate extends YeekuHibernateDaoSupport implements ManagerDao
{
	/**
	 * ���ݱ�ʶ����������Managerʵ��
	 * 
	 * @param id
	 *            ��Ҫ���ص�Managerʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Managerʵ��
	 */
	public Manager get(Integer id)
	{
		return getHibernateTemplate().get(Manager.class, id);
	}

	/**
	 * �־û�ָ����Managerʵ��
	 * 
	 * @param manager
	 *            ��Ҫ���־û���Managerʵ��
	 * @return Managerʵ�����־û���ı�ʶ����ֵ
	 */
	public String save(Manager manager)
	{
		return (String) getHibernateTemplate().save(manager);
	}

	/**
	 * �޸�ָ����Managerʵ��
	 * 
	 * @param manager
	 *            ��Ҫ���޸ĵ�Managerʵ��
	 */
	public void update(Manager manager)
	{
		getHibernateTemplate().update(manager);
	}

	/**
	 * ɾ��ָ����Managerʵ��
	 * 
	 * @param manager
	 *            ��Ҫ��ɾ����Managerʵ��
	 */
	public void delete(Manager manager)
	{
		getHibernateTemplate().delete(manager);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Managerʵ��
	 * 
	 * @param id
	 *            ��Ҫ��ɾ����Managerʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * ��ѯȫ����Managerʵ��
	 * 
	 * @return ���ݿ���ȫ����Managerʵ��
	 */
	@SuppressWarnings("unchecked")
	public List<Manager> findAll()
	{
		return (List<Manager>) getHibernateTemplate().find("from Manager");
	}

	/**
	 * �����û����������ѯ����
	 * 
	 * @param emp
	 *            ����ָ���û���������ľ���
	 * @return ����ָ���û���������ľ���
	 */
	@SuppressWarnings("unchecked")
	public List<Manager> findByNameAndPass(Manager mgr)
	{
		return (List<Manager>) getHibernateTemplate().find("from Manager m where m.name = ? and m.pass=?", mgr.getName(), mgr.getPass());
	}

	/**
	 * �����û������Ҿ���
	 * 
	 * @param name
	 *            ����������
	 * @return ���ֶ�Ӧ�ľ���
	 */
	public Manager findByName(String name)
	{
		@SuppressWarnings("unchecked")
		List<Manager> ml = (List<Manager>) getHibernateTemplate().find("from Manager m where m.name=?", name);
		if (ml != null && ml.size() > 0)
		{
			return ml.get(0);
		}
		return null;
	}
}