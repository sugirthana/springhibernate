package com.dsrc.bo;

import java.util.List;

import com.dsrc.bean.RegisterBean;
import com.dsrc.exceptions.ProfileMgmtException;

public interface ProfileBO {

	public boolean addPerson(RegisterBean p) throws ProfileMgmtException;
	public boolean updatePerson(RegisterBean p);
	public boolean removePerson(int id);
	public boolean changePassword(String pass,int id);
	
	
	public List<RegisterBean> login(RegisterBean r);

}
