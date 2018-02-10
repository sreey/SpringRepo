package com.sree.springbooth2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sree.springbooth2.domain.SessionMgmt;
import com.sree.springbooth2.service.SessionMgmtService;

@RestController
public class SessionMgmtController {

	@Autowired
	private SessionMgmtService sessionMgmtService;
	
	@PostMapping(value = "/sessions")
	public ResponseEntity<SessionMgmt> saveSession(@RequestBody SessionMgmt sessionMgmt) {
		sessionMgmtService.save(sessionMgmt);
		return new ResponseEntity<>(sessionMgmt, HttpStatus.OK);
	}
	
	@GetMapping(value = "/sessions")
	public SessionMgmt findSession(@RequestBody String sessionJWTToken){
		return sessionMgmtService.findSessionMgmt(sessionJWTToken);
	}
}
