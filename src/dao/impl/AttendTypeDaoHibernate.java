package dao.impl;

import hibernate3.support.YeekuHibernateDaoSupport;

import java.util.List;

import dao.AttendTypeDao;
import domain.AttendType;

public class AttendTypeDaoHibernate extends YeekuHibernateDaoSupport implements AttendTypeDao
{
	/**
	 * ���ݱ�ʶ����������AttendTypeʵ��
	 * 
	 * @param id
	 *            ��Ҫ���ص�AttendTypeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��AttendTypeʵ��
	 */
	public AttendType get(Integer id)
	{
		return getHibernateTemplate().get(AttendType.class, id);
	}

	/**
	 * �־û�ָ����AttendTypeʵ��
	 * 
	 * @param attendType
	 *            ��Ҫ���־û���AttendTypeʵ��
	 * @return AttendTypeʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(AttendType attendType)
	{
		return (Integer) getHibernateTemplate().save(attendType);
	}

	/**
	 * �޸�ָ����AttendTypeʵ��
	 * 
	 * @param attendType
	 *            ��Ҫ���޸ĵ�AttendTypeʵ��
	 */
	public void update(AttendType attendType)
	{
		getHibernateTemplate().update(attendType);
	}

	/**
	 * ɾ��ָ����AttendTypeʵ��
	 * 
	 * @param attendType
	 *            ��Ҫ��ɾ����AttendTypeʵ��
	 */
	public void delete(AttendType attendType)
	{
		getHibernateTemplate().delete(attendType);
	}

	/**
	 * ���ݱ�ʶ����ɾ��AttendTypeʵ��
	 * 
	 * @param id
	 *            ��Ҫ��ɾ����AttendTypeʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * ��ѯȫ����AttendTypeʵ��
	 * 
	 * @return ���ݿ���ȫ����AttendTypeʵ��
	 */
	@SuppressWarnings("unchecked")
	public List<AttendType> findAll()
	{
		return (List<AttendType>) getHibernateTemplate().find("from AttendType");
	}
}
