package action.base;

import service.MgrManager;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MgrBaseAction extends ActionSupport
{
	protected MgrManager mgr;

	public void setMgrManager(MgrManager mgr)
	{
		this.mgr = mgr;
	}
}