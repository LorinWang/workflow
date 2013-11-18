package dao;

import java.util.List;

import domain.AttendType;

public interface AttendTypeDao {
	/**
	 * ���ݱ�ʶ����������AttendTypeʵ��
	 * 
	 * @param id
	 *            ��Ҫ���ص�AttendTypeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��AttendTypeʵ��
	 */
	AttendType get(Integer id);

	/**
	 * �־û�ָ����AttendTypeʵ��
	 * 
	 * @param attendType
	 *            ��Ҫ���־û���AttendTypeʵ��
	 * @return AttendTypeʵ�����־û���ı�ʶ����ֵ
	 */
	Integer save(AttendType attendType);

	/**
	 * �޸�ָ����AttendTypeʵ��
	 * 
	 * @param attendType
	 *            ��Ҫ���޸ĵ�AttendTypeʵ��
	 */
	void update(AttendType attendType);

	/**
	 * ɾ��ָ����AttendTypeʵ��
	 * 
	 * @param attendType
	 *            ��Ҫ��ɾ����AttendTypeʵ��
	 */
	void delete(AttendType attendType);

	/**
	 * ���ݱ�ʶ����ɾ��AttendTypeʵ��
	 * 
	 * @param id
	 *            ��Ҫ��ɾ����AttendTypeʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����AttendTypeʵ��
	 * 
	 * @return ���ݿ���ȫ����AttendTypeʵ��
	 */
	List<AttendType> findAll();
}