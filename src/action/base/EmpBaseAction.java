package action.base;

import service.EmpManager;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class EmpBaseAction extends ActionSupport
{
	protected EmpManager mgr;

	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}

}
