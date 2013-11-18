package dao.impl;

import hibernate3.support.YeekuHibernateDaoSupport;

import java.util.List;

import dao.EmployeeDao;
import domain.Employee;
import domain.Manager;

public class EmployeeDaoHibernate extends YeekuHibernateDaoSupport implements EmployeeDao
{
	/**
	 * ���ݱ�ʶ����������Employeeʵ��
	 * 
	 * @param id
	 *            ��Ҫ���ص�Employeeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Employeeʵ��
	 */
	public Employee get(Integer id)
	{
		return getHibernateTemplate().get(Employee.class, id);
	}

	/**
	 * �־û�ָ����Employeeʵ��
	 * 
	 * @param employee
	 *            ��Ҫ���־û���Employeeʵ��
	 * @return Employeeʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(Employee employee)
	{
		return (Integer) getHibernateTemplate().save(employee);
	}

	/**
	 * �޸�ָ����Employeeʵ��
	 * 
	 * @param employee
	 *            ��Ҫ���޸ĵ�Employeeʵ��
	 */
	public void update(Employee employee)
	{
		getHibernateTemplate().update(employee);
	}

	/**
	 * ɾ��ָ����Employeeʵ��
	 * 
	 * @param employee
	 *            ��Ҫ��ɾ����Employeeʵ��
	 */
	public void delete(Employee employee)
	{
		getHibernateTemplate().delete(employee);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Employeeʵ��
	 * 
	 * @param id
	 *            ��Ҫ��ɾ����Employeeʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * ��ѯȫ����Employeeʵ��
	 * 
	 * @return ���ݿ���ȫ����Employeeʵ��
	 */
	@SuppressWarnings("unchecked")
	public List<Employee> findAll()
	{
		return (List<Employee>) getHibernateTemplate().find("from Employee");
	}

	/**
	 * �����û����������ѯԱ��
	 * 
	 * @param emp
	 *            ����ָ���û����������Ա��
	 * @return ����ָ���û����������Ա������
	 */
	@SuppressWarnings("unchecked")
	public List<Employee> findByNameAndPass(Employee emp)
	{
		return (List<Employee>) getHibernateTemplate().find("from Employee p where p.name = ? and p.pass=?", emp.getName(), emp.getPass());
	}

	/**
	 * �����û�����ѯԱ��
	 * 
	 * @param name
	 *            Ա�����û���
	 * @return �����û�����Ա��
	 */
	public Employee findByName(String name)
	{
		@SuppressWarnings("unchecked")
		List<Employee> emps = (List<Employee>) getHibernateTemplate().find("from Employee where name = ? ", name);
		if (emps != null && emps.size() >= 1)
		{
			return emps.get(0);
		}
		return null;
	}

	/**
	 * ���ݾ����ѯԱ��
	 * 
	 * @param mgr
	 *            ����
	 * @return �þ����Ӧ������Ա��
	 */
	@SuppressWarnings("unchecked")
	public List<Employee> findByMgr(Manager mgr)
	{
		return (List<Employee>) getHibernateTemplate().find("from Employee as e where " + "e.manager = ?", mgr);
	}
}
