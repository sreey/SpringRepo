package com.sree.springbooth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.springbooth2.domain.SessionMgmt;
import com.sree.springbooth2.repository.SessionMgmtRepository;

@Service
public class SessionMgmtServiceImpl implements SessionMgmtService {

	@Autowired
	private SessionMgmtRepository sessionMgmtRepository;
	
	public void save(SessionMgmt sesssionMgmt) {
		sessionMgmtRepository.save(sesssionMgmt);
	}
	
	public SessionMgmt findSessionMgmt(String sessionJWTID) {
		return sessionMgmtRepository.findOne(sessionJWTID);
	}
}
