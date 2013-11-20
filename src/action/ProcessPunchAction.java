package action;

import static service.EmpManager.PUNCHED;
import static service.EmpManager.PUNCH_FAIL;
import static service.EmpManager.PUNCH_SUCC;
import service.EmpManager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ProcessPunchAction extends ActionSupport
{
	// ��Action��������ҵ���߼����
	private EmpManager empMgr;
	// ��װ���������tip����
	private String tip;

	// ����ע��ҵ���߼������setter����
	public void setEmpManager(EmpManager empMgr)
	{
		this.empMgr = empMgr;
	}

	// tip���Ե�setter��getter����
	public void setTip(String tip)
	{
		this.tip = tip;
	}

	public String getTip()
	{
		return this.tip;
	}

	// �����ϰ�򿨵ķ���
	public String come() throws Exception
	{
		return process(true);
	}

	// �����°�򿨵ķ���
	public String leave() throws Exception 
	{
		return process(false);
	}

	private String process(boolean isCome) throws Exception
	{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�user����
		String user = (String) ctx.getSession().get(WebConstant.USER);
		System.out.println("-----��----" + user);
		String dutyDay = new java.sql.Date(System.currentTimeMillis()).toString();
		// ����ҵ���߼���������������
		int result = empMgr.punch(user, dutyDay, isCome);
		switch (result)
		{
		case PUNCH_FAIL:
			setTip("��ʧ��");
			break;
		case PUNCHED:
			setTip("���Ѿ�������ˣ���Ҫ�ظ���");
			break;
		case PUNCH_SUCC:
			setTip("�򿨳ɹ�");
			break;
		}
		return SUCCESS;
	}
}