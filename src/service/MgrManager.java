package service;

import java.util.List;

import vo.AppBean;
import vo.EmpBean;
import vo.SalaryBean;
import domain.Employee;


public interface MgrManager
{
	/**
	 * ����Ա��
	 * @param emp ������Ա��
	 * @param mgr Ա�������ľ���
	 */
	void addEmp(Employee emp , String mgr)
		throws Exception;


	/**
	 * ���ݾ��������еĲ����ϸ��¹���
	 * @param mgr ������Ա����
	 * @return �����ϸ��¹���
	 */
	List<SalaryBean> getSalaryByMgr(String mgr)throws Exception;

	/**
	 * ���ݾ����ظò��ŵ�ȫ��Ա��
	 * @param mgr ������
	 * @return �����ȫ������
	 */
	List<EmpBean> getEmpsByMgr(String mgr)throws Exception;

	/**
	 * ���ݾ����ظò��ŵ�û������������
	 * @param mgr ������
	 * @return �ò��ŵ�ȫ������
	 */
	List<AppBean> getAppsByMgr(String mgr)throws Exception;

	/**
	 * ��������
	 * @param appid ����ID
	 * @param mgrName ��������
	 * @param result �Ƿ�ͨ��
	 */
	void check(int appid, String mgrName, boolean result);
}