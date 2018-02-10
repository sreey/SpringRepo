package com.sree.springbooth2.service;

import com.sree.springbooth2.domain.SessionMgmt;

public interface SessionMgmtService {

	public void save(SessionMgmt sesssionMgmt);
	
	public SessionMgmt findSessionMgmt(String sessionJWTID);
}
